package daily_practice;

import java.util.HashMap;
import java.util.Map;

public class A102 {

	public static void main(String[] args) {
		
		Map a3=new HashMap();
		a3.put("Name", "Nitisha");
		a3.put("Class", 12);
		a3.put("Section", 'F');
		a3.put("RollNo", 45);
		a3.put("Add", "85/38 Karol Bagh");
		
		System.out.println(a3.get("Name"));
		System.out.println(a3.get("Class"));
		System.out.println(a3.get("Section"));
		System.out.println(a3.get("RollNo"));
		System.out.println(a3.get("Add"));
		System.out.println(a3.containsKey("Class"));
		System.out.println(a3.containsValue(12));
		
		System.out.println(a3.size());
		System.out.println(a3.remove("Add","85/38 Karol Bagh"));
		System.out.println(a3.get("Add"));
		
	}

}
