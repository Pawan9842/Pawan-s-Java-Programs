package test_demo_2;

public class opearators {

	
	public void Addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void Subtraction(int a, int b) {
		System.out.println(a-b);
	}
	
	public void Division(int a, int b) {
		System.out.println(a/b);
	}
	
	public void Multiplication(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		// now a & b are the instance variables 
		// hence for calling them e need to create the Object 
		// classname referencename=new classname ();
		opearators test=new opearators();
		test.Addition(20, 10);
		test.Subtraction(20, 10);
		test.Division(20, 10);
		test.Multiplication(20, 10);
		

	}

}
