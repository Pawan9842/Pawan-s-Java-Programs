package Task_1;

public class Swap_without_3rd_variable {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are--"+a+" "+b);
		
		// logic 2=without using 3rd variable 
		// using +,- 
		
	/*	a=a+b;  //10+20=30 (latest value of a)
		b=a-b;  //30-20=10 (latest value of b)
		a=a-b;  //30-10=20 (latest value of a)*/
		
	//	logic 3= using multiplication and division
	//  but a and b values should be non zero
		
	/*	a=a*b; //10*20=200--latest value of a=200
		b=a/b; //200/20=10--latest value of b=10
		a=a/b; //200/10=20--latest value of a=20 */
		
		//logic 4=single statement and not 3rd variable 
		// a=10   b=20
		
		b=a+b-(a=b);  // here execution happens from right to left
		              // first a beomes 20 and then b=a+b-20 but here a+b will be 10+20 
		              // thus b=30-20=10
		
		System.out.println("After swapping values are--"+a+" "+b);

	}

}
