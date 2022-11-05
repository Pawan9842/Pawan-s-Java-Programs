package test_demo_2;

import java.util.Scanner;

public class Test_Switch_3 {

	public static void main(String[] args) {
		
		System.out.println("vowels and consonants");
		
		// vowels consonant using if----else
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || 
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
			System.out.println(ch+" is a vowel");
			
		}else {
			System.out.println(ch+" is a consonant");
		}
		
	}

}
