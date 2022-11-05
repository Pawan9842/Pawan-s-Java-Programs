package daily_practice;

import java.util.ArrayList; // pre defined 
import java.util.List;  // pre defined interface

public class A100 {

	public static void main(String[] args) {
		
		// ArrayList follows index
		// duplication is allowed
		
		List a1= new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add("Rachel");
		a1.add(3, 'w');
		a1.add(30);
	
		
		
		System.out.println(a1.size());
		System.out.println(a1);
	
		System.out.println(a1.get(4));
		System.out.println(a1.isEmpty());  // false
		a1.remove(3);
		System.out.println(a1.size());
		System.out.println(a1.contains(40));
		
		System.out.println(a1);
		
	}

}
