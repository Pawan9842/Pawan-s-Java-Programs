package questions;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		//     9=1,9       2 to 8    17=1,17    2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
		int a;
		int t=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		a=s.nextInt();  
		for(int i=2;i<a;i++) {  //2  3  4
			if(a%i==0) {
				t=t+1;
			}		
		}
		if(t>0) {
			System.out.println(a+" is not a Prime Number");
		}
		else if(a>0)  {
			System.out.println(a+" is a Prime Number");
		}
		else {
			System.out.println("Entered Number in Invalid");
		}
		

	}

}
