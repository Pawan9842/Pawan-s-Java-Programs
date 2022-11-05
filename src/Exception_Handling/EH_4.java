package Exception_Handling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
	YoungerAgeException (String msg) {
		super(msg);
	}
}

public class EH_4 {

	public static void main(String[] args)  {
		try {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Child's Age");
		age=s.nextInt();
		if (age<4) {
			System.out.println("Doctor is Fraud");
			throw new YoungerAgeException("Your child is not eligible");
		
		}
		else {
			System.out.println("Your child is eligible for admission");
		}
		}
		catch (YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Doctor is ill");
	}

}
