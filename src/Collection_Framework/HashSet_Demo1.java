package Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Demo1 {

	public static void main(String[] args) {
		// HashSet 
		//does not allow duplicate values
		// does not follow index
		Set a2=new HashSet();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(100);
		a2.add(50);
		a2.remove(90);
		a2.remove(30);
		System.out.println(a2.isEmpty());
		System.out.println(a2.contains(90));
		System.out.println(a2.contains(10));
		System.out.println(a2);
//		a2.clear();
		System.out.println(a2);
		
		System.out.println();
		
		Iterator itr=a2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
