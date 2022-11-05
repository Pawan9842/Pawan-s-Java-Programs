package Task_1;

import java.util.Scanner;

public class Scanner_Prac {

	public static void main(String[] args) {
		
		int a,b, area;
		System.out.println("Please enter the length of a rectangle");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Please enter the breadth of a rectangle");
		b=s.nextInt();
		area=a*b;
		System.out.println(area);
	}

}
