package daily_practice;

import java.util.Scanner;

public class Leap_Year_Practice {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=s.nextInt();
		
		
		if ((year%400==0) || (year%4==0) && (year%100!=0)) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
	}

}
