package ie.gmit.sw;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DictionaryService extends Remote {
	public byte[] getDictionary(String d) throws RemoteException;
	public String lookup(String s) throws RemoteException;

}
