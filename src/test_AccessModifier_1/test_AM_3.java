package test_AccessModifier_1;

import test_AccessModifier_2.A1;

public class test_AM_3 extends A1 { // if "extends" keyword is used that means test_AM_3 is the subclass of A1
									// and this allows us to access public and protected datatypes values

	public static void main(String[] args) {
		
		
		test_AM_3 s=new test_AM_3(); // ptr: but now for object creation we will use this class's name 
		System.out.println(s.a);
	//	System.out.println(s.d);
		System.out.println(s.b);
	//	System.out.println(s.c);
		System.out.println(s.a*s.b);
		
		
		

	}

}
