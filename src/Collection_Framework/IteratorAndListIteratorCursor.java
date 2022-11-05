package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIteratorCursor {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add("Pawan");
		System.out.println(l);
		System.out.println("===============================================");
		
		Iterator itr=l.iterator();  //Iterator is an Interface Cursor
		while(itr.hasNext()) {   //hasNext() returns boolean value  and checks if there 
			                  // is any element or not if true then goes inside while
			System.out.println(itr.next());
		}
		System.out.println("==========================================");
		 ListIterator litr=l.listIterator();  // we can iterate forward as well as
		 while(litr.hasNext()) {             // backward using ListIterator
			 System.out.println(litr.next());
		 }
		 System.out.println("===================");
		 
		
		 
		 while(litr.hasPrevious()) {
			 System.out.println(litr.previous());
		 }
		litr.set("Doctor");  //since cursor is at "10" it will replace it with "Doctor"
		System.out.println(l);
		
	}

}
