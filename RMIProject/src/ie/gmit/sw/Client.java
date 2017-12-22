package ie.gmit.sw;

import java.io.File;
import java.rmi.Naming;


public class Client {

	public static void main(String[] args) throws Exception {
		DictionaryService ds = (DictionaryService) Naming.lookup("rmi://127.0.0.1:1099/Dictionary");
		
		System.out.print("Dictionary currently on Server: ");
		
		@RequestMapping(value="/text",method=RequestMethod.GET)
			public String getWord() {
			return;
			}
	}
}
