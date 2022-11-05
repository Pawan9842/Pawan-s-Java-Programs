package test_demo_2;

import java.util.Scanner;

public class Test_Switchh_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char alpha=sc.next().charAt(0);
	
		switch(alpha) {
		case 'a':
			System.out.println(alpha+" is a vowel");
			break;
		case 'e':
			System.out.println(alpha+" is a vowel");
			break;
		case 'i':
			System.out.println(alpha+" is a vowel");
			break;
		case 'o':
			System.out.println(alpha+" is a vowel");
			break;
		case 'u':
			System.out.println(alpha+" is a vowel");
			break;
		default:
			System.out.println(alpha+" is a consonant");
		}
		
	}

}
