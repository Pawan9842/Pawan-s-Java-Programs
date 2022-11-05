package pawan_basics_1;

public class new_class_1 {
	
	int a=10; // instance variable/non static var
	static int b=20; // static variable
	

	public static void main(String[] args) {
		
		int c=30; // local variable
		
		System.out.println(c);
		
		
		//for calling static variable: 2 types 
		//1st= directly calling by variable name
		System.out.println(b);
        //2nd= by calling class name.variable name
		System.out.println(new_class_1.b);
		
		//for calling instance variable an object needs to be created
		// classname referencename=new classname();
		//and then calling referencename.variable name
		
		new_class_1 o1=new new_class_1();
		System.out.println(o1.a);
		
	}

}
