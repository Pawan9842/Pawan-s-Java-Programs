package Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorCursor {

	public static void main(String[] args) {
		
		Set s=new HashSet();  //Iterator can be used with any collection object 
		s.add(10);            //with List implemented classes as well as   
		s.add(20);            //Set implemented classes cannot iterate backward
		s.add("Pawan");
		s.add("Doctor");
		s.add(30);
		s.add(40);
		s.add("Job");
		
		
		System.out.println(s);
		
		System.out.println("===============================================");
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("================================================");
	
		System.out.println(s);
		
		
	}

}
