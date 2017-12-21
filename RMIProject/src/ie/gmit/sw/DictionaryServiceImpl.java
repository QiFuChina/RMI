package ie.gmit.sw;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class DictionaryServiceImpl extends UnicastRemoteObject implements DictionaryService {
	private String s;
	
	Search word=new Search(s);
	
	public DictionaryServiceImpl() throws RemoteException{
		super();
	}

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
		// TODO Auto-generated method stub
		return  s;
	}

	


}
