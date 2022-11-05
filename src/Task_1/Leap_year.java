package Task_1;

public class Leap_year {

	public static void main(String[] args) {
		
		int year=1984;
		
		// to find a leap year century year and ordinary year these both are found out in two different ways
		//for a century year it should be divisible by 400
		//for an ordinary year it should be divisible by 4 and not by 100
		 
		if((year%400==0) || (year%4==0 && year%100!=0)) {
			System.out.println("Year 1984 is a Leap Year");
		}
		else {
			System.out.println("Year 1984 is not a Leap Year");
		}
		
	}

}
