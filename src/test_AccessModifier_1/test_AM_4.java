package test_AccessModifier_1;

import test_AccessModifier_2.A1;

public class test_AM_4 {

	public static void main(String[] args) {
		
		A1 s=new A1();		// here we will not create any subclass and directly create the object by using 
							// class A1 since we can access public values anywhere outside the pacage 
							// without using subclass
		System.out.println(s.b);

	}

}
