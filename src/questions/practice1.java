package questions;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// area of a triangle=l*b*h
		int l,b,h;
		int area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length");
		l=s.nextInt();
		System.out.println("Enter the breadth");
		b=s.nextInt();
		System.out.println("Enter the height");
		h=s.nextInt();
		area=l*b*h;
		System.out.println("Area of a triangle is "+area);
	}

}
