package test_demo_2;

public class new_class_2 {
	
	int a= 10; // instance variable
	static int b=20; // staic variable
	
	// for creating a method 
	// syntax: accessmodifer returntype methodname() {......code....}
	
	public static void m1() {
		System.out.println("this is method1"); 
		int c=30;
		System.out.println(c);
	}
	public static void Addition(int a, int b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
	  
		System.out.println(new_class_2.b); // calling static variable using classname.variablename
		new_class_2.m1(); // calling method m1  
		new_class_2.Addition(10, 20);
		new_class_2.Addition(129, 297);
		
		new_class_2 test= new new_class_2(); // class object
		System.out.println(test.a);  //10
		System.out.println(test.b);//   20.... static variable can also be called using class object
		
		test.a = 1000;
		test.b = 2000;
		System.out.println(test.a);   //1000
		System.out.println(test.b);   //2000
		new_class_2 test1= new new_class_2();
		System.out.println(test1.a);   //10
		System.out.println(test1.b);   //2000
		

	}

}
