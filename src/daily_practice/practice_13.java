package daily_practice;

import java.util.Scanner;

public class practice_13 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+" is a vowel");
		}else {
			System.out.println(ch+" is a consonant");
		}
	}

}