package daily_practice;

public class Operators {
	
	int a=10;

	public static void main(String[] args) {
		int b=20;
		int c=30;
		Operators o1=new Operators();
		
		System.out.println(b>c);
		System.out.println(o1.a<b);
		System.out.println(o1.a==c);
		System.out.println(b<=c);
		
		System.out.println(o1.a<b && b>c);
		System.out.println(o1.a==b || b<c);
		
		
		
		

	}

}
