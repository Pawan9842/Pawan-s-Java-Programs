package Task_1;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {              //1 2 34567 8 9
		int n;int T=0;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				T=T+1;  // we took int T to check that if n fully divided by i then T will become greater than zero
				        // and that means n is not a prime number
			}
		}
		if (T>0) {
			System.out.println(n+" is not a prime number");
		}
		else if (n>0) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is an invalid number");
		}
		
		
	}

}
