package Task_1;

public class Reverse_String_1 {

	public static void main(String[] args) {
		
	//	Logic 1: by using the replace method 
		
	/*	String a="Hello";
		System.out.println("Before Reversing the String: "+a );
		String b=a.replace("Hello", "olleH");
		System.out.println("After Reversing the String: "+b);  */
		
	// Logic 2: by using for loop
		
		String a="Rachel";
		System.out.println("Length of a String: "+a.length());
		System.out.println("Before Reversing the String: "+a);
		
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println("After Reversing the String: "+rev);
		

	}

}
