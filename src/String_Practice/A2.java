package String_Practice;

public class A2 {

	public static void main(String[] args) {
		
		String s1="Rachel";
		String s2="Gupta";
		System.out.println(s1+s2); //RachelGupta
		System.out.println(s1+" "+s2);  //Rachel Gupta
		System.out.println(s1+10);  //Rachel10  10 acts as string here...   here first it will get concatenated
		System.out.println(s1+10+20);  //Rachel1020  10 and 20 act as string .... here first it will get concatenated
		System.out.println(10+20+s1);  //30Rachel  here first addition as integers if written first
		System.out.println(10+s1+20);  //10Rachel20
		System.out.println(s1+20/10);  //Rachel2  here first division than concatation
		System.out.println(s1+10%11);  //Rachel10  first it will give remainder
		System.out.println(s1+2*3);  //Rachel6
	//	System.out.println(s1+20-10);  error, bcoz due to bodmas first due "+" it will concat and then can't do minus  
		System.out.println(s1.concat(s2));  //RachelGupta
		System.out.println(String.join("_Pawan_",s1,s2));  //Rachel_Pawan_Gupta
		
		String s="Rachel Is Love";
		
		       // in bracket (begin index, end index)
		       // output from begin index to end index - 1(minus 1)
		System.out.println(s.length());
		System.out.println(s.subSequence(3, 12));  //hel Is Lo
		System.out.println(s.substring(0));  //Rachel Is Love
		System.out.println(s.substring(3,9));  //hel Is
		
		
		System.out.println(String.join(" 123 ", s1,s,s2));
		
		
	}

}
