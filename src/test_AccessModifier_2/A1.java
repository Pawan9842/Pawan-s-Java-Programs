package test_AccessModifier_2;

public class A1 {
	
	protected int a = 10;
	public int b = 20;
	int c = 30;
	private int d = 40;
	

	public static void main(String[] args) {
		
		A1 s=new A1();
		System.out.println(s.a);
		System.out.println(s.d);
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println(s.a*s.b);
		
		

	}

}
