package daily_practice;

public class practice_3 {
	
	int a=10;
	static int b=20;
	
	public static void m1() {
		System.out.println("method 1");
		int c=30;
		System.out.println(c);
	}
	
	public static void Addition(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		practice_3 test=new practice_3();
		System.out.println(test.a);
		System.out.println(practice_3.b);
		practice_3.m1();
		practice_3.Addition(10, 20);
		

	}

}
