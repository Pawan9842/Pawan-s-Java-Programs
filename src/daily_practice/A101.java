package daily_practice;

import java.util.HashSet;
import java.util.Set;

public class A101 {

	public static void main(String[] args) {
		
		Set a2=new HashSet();
		a2.add(10);
		a2.add("Joey");
		a2.add(20);
		a2.add(30);
		a2.add('s');
		a2.add(10);
		a2.remove(10);
		
		System.out.println(a2);
		System.out.println(a2.isEmpty());
		System.out.println(a2.size());
		System.out.println(a2.contains("jpey"));
		System.out.println(a2.contains(10));
	
		
		
	}

}
