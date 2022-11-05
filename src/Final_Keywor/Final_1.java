package Final_Keywor;

  class ABC {   
	 void m1() {
		System.out.println("Cricket");
		System.out.println("parent class");
	}
}

   public final class Final_1 extends ABC  {  // final class can inherit another class
											// final class cannot be inherited
	void m1() {
		System.out.println("Virat Kohli is God");
	}
	
	
	
	public static void main(String[] args) {
		// uses of final keyword for variables
		final int a=10;
	//	a=a+100;
		System.out.println(a);
	final	double pi=3.14;
//		pi=pi+1;
	//	System.out.println(pi);*/
		
		Final_1 q=new Final_1();
		q.m1();
	}

}
