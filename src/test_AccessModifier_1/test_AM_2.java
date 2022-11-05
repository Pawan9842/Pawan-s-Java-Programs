package test_AccessModifier_1;
 
class Test {
	public int a=10;
	protected int b=20;
	 int c=30;     // for default no need to write the AM name i.e. "default"
	private int d=40;
}


public class test_AM_2 {
	
	public static void main(String[] args) {
		
		Test test1=new Test();
		System.out.println(test1.a);
		System.out.println(test1.b);
		System.out.println(test1.c);
		//   System.out.println(test1.d);   "private AM" will not be printed outside the class in which 
	    //                                   it was declared
		
	}

}
