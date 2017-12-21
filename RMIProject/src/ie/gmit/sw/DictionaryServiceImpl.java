package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class DictionaryServiceImpl extends UnicastRemoteObject implements DictionaryService {
	private String s;
	
	public DictionaryServiceImpl() throws RemoteException{
		super();
	}

	@Override
	public String lookup(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return  s;
	}


}
