package ie.gmit.sw;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DictionaryService ds=new DictionaryServiceImpl();
		
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("Dictionary", ds);
		
		System.out.println("Server ready.");

	}

}
