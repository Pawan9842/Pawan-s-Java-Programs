package String_Practice;

public class A1 {

	public static void main(String[] args) {
		String s1=new String("Rachel");
		String s2="Rachel";
		String s3="Hello@Chandler@Bing";
		String s4="length,equals,equalsignorecases,charat,upper"
				+ ",lower,concat,split,trim,replace,start,end,reverse";
		String s5=new String("Rachel");
		System.out.println(s1==s2);
		System.out.println(s2==s5);
		System.out.println(s1==s5);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s4.length());
		System.out.println(s4.charAt(6));
		System.out.println(s3.toUpperCase());
		System.out.println(s3.concat(s1));
		
		String[] a=s3.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		String s6="  P E nny ";
		System.out.println(s6.trim());
		System.out.println(s6.replace(" ", ""));
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
