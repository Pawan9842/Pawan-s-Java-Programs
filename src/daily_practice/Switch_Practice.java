package daily_practice;

import java.util.Scanner;

public class Switch_Practice {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first no.");
		int no1=s.nextInt();
		System.out.println("Enter second no.");
		int no2=s.nextInt();
		System.out.println("Select symbol(+,-,*,/)");
		String sym=s.next();
		int result;
		switch(sym) {
			case"+":result=no1+no2;
					System.out.println("Addition is: "+result);
					break;
			case"-":result=no1-no2;
			System.out.println("Subtraction is: "+result);
			break;
			case"*":result=no1+no2;
			System.out.println("Multiplication is: "+result);
			break;
			case"/":result=no1+no2;
			System.out.println("Division is: "+result);
			break;
			default:System.out.println("Symbol is Invalid");
		}
	}

}
