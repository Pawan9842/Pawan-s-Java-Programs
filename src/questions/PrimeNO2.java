package questions;

import java.util.Scanner;

public class PrimeNO2 {

	public static void main(String[] args) {
		//  7=1&7---1 2 3 4 5 6 7
		//  17=1&17----1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17--  output 17 is a prime no.
		//  9=1&9----1 2 3 4 5 6 7 8 9--  output 9 is not a prime no. 
		
		int a; //suppose a=999  from 2 to 999-1   
		int t=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		a=s.nextInt();
		for(int i=2;i<a;i++) {
			if(a%i==0) {  //a=6  6%2=0   1 and 6  but also 2 se ho gaya
				t=t+1;
			}	
		}
		if (t>0) {
			System.out.println(a+" is not a Prime Number");
		}
		else if(a>0) {
			System.out.println(a+" is a Prime Number");
		
		}
		else {
			System.out.println(a+" is an Invalid Number");
		}
		
		
		
	}

}
