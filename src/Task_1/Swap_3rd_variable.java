package Task_1;

public class Swap_3rd_variable {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are--"+a+" "+b);
		
		//logic 1= using third variable
		
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping values are--"+a+" "+b);

	}

}
