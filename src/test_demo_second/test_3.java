package test_demo_second;

import test_demo_first.test_1;

public class test_3 {

	public static void main(String[] args) {
       
		test_1 test3=new test_1();   // after creating the object always import the pacage and class from where we want 
		                             // to import the variable
		
		System.out.println(test3.a);   // public variable has scope in whole project outside the package as well
	//	System.out.println(test3.b);     protected variable has scope within the package
	//	System.out.println(test3.c);    /these 3 variables will not be printed
	//	System.out.println(test3.d);
	}

}
