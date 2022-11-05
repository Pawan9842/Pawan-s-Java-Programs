package questions;

import java.util.Scanner;

public class Palindrome_Nooo {

	public static void main(String[] args) {
		
		int no;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		no=s.nextInt();   //   122
		int t=no;
		int rev=0, rem;
		while(t!=0) {
			rem=t%10;  //1
			rev=rev*10+rem;  //221
			t=t/10;  //0                
			
		}
		if(rev==no) {
			System.out.println(no+" is a Palindrome Number");
		}
		else {
			System.out.println(no+" is not a Palindrome Number");
		}

	}

}
