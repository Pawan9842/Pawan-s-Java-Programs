package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo1 {

	public static void main(String[] args) {
		// HashMap
		// key & value pair
		Map a3=new HashMap();
		a3.put("Name", "Rachel Greene");
		a3.put("Occupation", "Stylist");
		a3.put("Add", 79+" Street NY");
		a3.put("URL", "www.ralphlauren.com");
		System.out.println(a3.get("Name"));
		System.out.println(a3.get("Occupation"));
		System.out.println(a3.get("Add"));
		System.out.println(a3.get("URL"));
		
		
		
	}

}
