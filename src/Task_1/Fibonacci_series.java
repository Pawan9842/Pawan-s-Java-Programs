package Task_1;

public class Fibonacci_series {
	
	//0 1 1 2 3 5 13 21 ------addition of previous two numbers

	public static void main(String[] args) {
		
		int a=0, b=1; // we have to initialize first two values initially
		System.out.print(a+" "+b);//ptr= do not write ln after print
		
		int c;
		for(int i=1;i<=8;i++) {  // "<=8" to print first 10 numbers
			
			c=a+b; //0+1=1
			System.out.print(" "+c); //ptr= do not write ln after print
			a=b; // swapping : latest value of a is 1
			b=c; // swapping : latest value of b is 1
		}

	}

}
