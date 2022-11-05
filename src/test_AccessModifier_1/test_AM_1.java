package test_AccessModifier_1;

public class test_AM_1 {
	
	public int a=10;
	protected int b=20;
	int c=30;   // default access modifier     // these all 4 variables are instance variables
	private int d=40;


	public static void main(String[] args) {
		
		// for calling non static variables we need to create object
		
		 test_AM_1 test=new  test_AM_1();
		
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);   
		System.out.println(test.d);
		
		// thus we can say that WITHIN CLASS all variables can be called
		

	}

}
