package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List_Demo1 {

	public static void main(String[] args) {
		// ArrayList 
		// allows duplicate value
		// takes index values
		// 
		List a1=new ArrayList();
		a1.add(10);// here itself took the index 1
		a1.add(20);// here took index 2
		a1.add(0,"Joey King"); // now here we have put index 0,, thus it will print joey king at 0th index and then starting from 1st indx
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1.get(0));
		a1.add(20);// duplication is allowed
		System.out.println(a1.size());

		a1.remove(4);// thus removed the value of 4th index place
		
	//	a1.clear();  // output = []  i.e. it cleared all values
		System.out.println(a1.size());
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println();
		
		
		//Iterator is an Interface... by using .iterator method we can print values one after one 
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		ListIterator litr=a1.listIterator();   //ListIterator also has .hasPrevous method 
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
//		List l1=a1.sort();
		
	}

}
