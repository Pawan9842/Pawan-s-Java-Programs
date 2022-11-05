package test_demo_2;

public class Test_Demo_Stringg {

	public static void main(String[] args) {
		
		String s1=new String("Test");
		String s2="Test";
		String s3="Demo";
		String s4="Demo";
		System.out.println(s1==s2);  // comparison reference------> same object
		System.out.println(s1==s3);
		
		
		
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s2));// here content is compared
		System.out.println(s3.equals(s4));

	}

}
