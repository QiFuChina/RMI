package ie.gmit.sw;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) throws Exception {
		DictionaryService ds = (DictionaryService) Naming.lookup("rmi://127.0.0.1:1099/Dictionary");
	}
}
