package test_demo_second;

import test_demo_first.test_1;

public class test_2 extends test_1 {

	public static void main(String[] args) {
		
		test_2 test1=new test_2();
		System.out.println(test1.a);
		System.out.println(test1.b);
	//	System.out.println(test1.c);    this default variable does not have scope outside the package
	//	System.out.println(test1.d);    this private variable does not have scope outside the class
		
	}

}
