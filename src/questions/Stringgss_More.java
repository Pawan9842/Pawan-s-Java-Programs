package questions;

public class Stringgss_More {

	public static void main(String[] args) {
		
		String s1="Mahabaleshwar";// scp
		String s2=new String("Mahabaleshwar"); // hm and scp
		String s3="Mahabaleshwar"; //scp
		String s4=new String("Mahabaleshwar");// hm and scp
		String[] a =s1.split("a"); 
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(s1.subSequence(4, 10));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.repeat(2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat("Hill"));
		System.out.println(s1);
		System.out.println();
}

}
