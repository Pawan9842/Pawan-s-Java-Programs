package questions;

public class Questions_Practice {

	public static void main(String[] args) {
		
		String a="Rameshwar";
		String rev="Pawan";
		System.out.println(a.length());
		for (int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		System.out.println(a.concat(rev));
	}

}
