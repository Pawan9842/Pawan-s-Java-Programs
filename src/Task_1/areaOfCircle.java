package Task_1;

import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) {
		// area of a circle by taking the user input for radius value
		
		double r, area;// pie takes double data type value
		
		System.out.println("Please enter the radius of the circle");
		Scanner s=new Scanner(System.in);// import java.util.Scanner
		r=s.nextDouble();// take the value of r from user
		area=3.14*r*r;
		System.out.println(area);
		
		

	}

}
