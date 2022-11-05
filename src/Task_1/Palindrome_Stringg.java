package Task_1;

public class Palindrome_Stringg {

	public static void main(String[] args) {
		
		String a ="Malayalam";
		String rev="";
		System.out.println(a.length());
		for (int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equalsIgnoreCase(rev)) {
			System.out.println(a+" is a Palindrome String");
		}
		else {
			System.out.println(a+" is not a Palindrome String");

		}
	}

}
