package ie.gmit.sw;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class DictionaryServiceImpl extends UnicastRemoteObject implements DictionaryService {
	private static final long serialVersionUID = 1L;
	
	private String wrod;
	
	Search word=new Search(wrod);
	
	public DictionaryServiceImpl() throws RemoteException{
		super();
	}

	//Read context from local file
	@Override
	public byte[] getDictionary(String d) {
		byte[] bytes = null;
		try {
			bytes = Files.readAllBytes(new File("Dictionary/Dictionary").toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	@Override
	public String lookup(String s) throws RemoteException {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		if(s.contains(wrod)) {
			return "Wrod exist";
		}
		else {
			return "No result";
			}
	}

	


}
