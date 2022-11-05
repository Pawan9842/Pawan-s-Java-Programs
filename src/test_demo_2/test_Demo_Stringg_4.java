package test_demo_2;

public class test_Demo_Stringg_4 {

	public static void main(String[] args) {
		// reverse String --->Test---.tseT
		
		String s1="Test";
		
		System.out.println(s1.length());
		
		//charAt(index);
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);

	}

}
