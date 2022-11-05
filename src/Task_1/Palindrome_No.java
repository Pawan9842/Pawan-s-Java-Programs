package Task_1;

public class Palindrome_No {

	public static void main(String[] args) {
		
		int no=1266212;  // initially take example such as 121 or 123 etc 221
		int T=no;
		int rev=0, rem;
		while(T!=0) {
			rem=T%10;//1           // line no 8 to 13 remains same for any value you put inside int no=(value you put)
			rev=rev*10+rem;// rev=221
			T=T/10;//0
		}
		if(no==rev) {
			System.out.println(no+" is a palindrome number");
		}
		else {
			System.out.println(no+" is not a palindrome number");
		}
	}

}
