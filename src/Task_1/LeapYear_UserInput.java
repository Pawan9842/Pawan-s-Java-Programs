package Task_1;

import java.util.Scanner;

public class LeapYear_UserInput {

	public static void main(String[] args) {
		
		//printing Leap Year by taking user input
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a Year");
		int year=a.nextInt();
		
		if((year%400==0) || (year%4==0) && (year%100!=0)) {
			System.out.println(year+"  is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
	}

}
