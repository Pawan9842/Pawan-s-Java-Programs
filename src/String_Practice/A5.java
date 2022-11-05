package String_Practice;

public class A5 {

	public static void main(String[] args) {
		
		String s1="Rameshwar";
		
		char [] a=new char[20];
		try {
		s1.getChars(10, 20, a, 0);
		System.out.println(a);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s1.subSequence(1, 6));
		System.out.println(s1.substring(1, 6));
		System.out.println(s1.subSequence(3, 9));
		System.out.println(s1.substring(3));
		System.out.println(s1.repeat(3));
		
	}

}
