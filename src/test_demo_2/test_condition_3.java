package test_demo_2;

public class test_condition_3 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		int a=5; // local variable
		
		if(a>0) {
			
			System.out.println("A is greater than Zero");
			
		}
		else if (a==0) {
			System.out.println("A is equal than Zero");
			
		}
		else if (a<0) {
			System.out.println("A is less than Zero");
		} else {
			System.out.println("Default Execution");
		}
		System.out.println("BugSpotter");

	}

}
