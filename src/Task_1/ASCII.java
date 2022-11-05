package Task_1;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// by assigning the value ourself
	//	char ch='@';
	//	int i=ch;
	//	System.out.println("ASCII value of"+ch+"="+i);  // it will keep on printing the values of whatever input you put
		
		//by user input
		
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Character");
		ch=s.next().charAt(0);
		int i=ch;
		System.out.println("ASCII value of "+ch+" is "+i);
		
		
	}

}
