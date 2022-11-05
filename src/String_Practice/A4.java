package String_Practice;

public class A4 {

	public static void main(String[] args) {
		//String : searching characters in String
		String s="Penny Hofstadter";
		
		System.out.println(s.indexOf("n"));  //2
		System.out.println(s.indexOf("ny"));  //3  it will index o second 'n' in this case
		System.out.println(s.lastIndexOf('e'));  //14   ....it will now give index position of e checking for e from last
		System.out.println(s.charAt(8));  // put only integer value less than length 
		System.out.println(s.contains("fst"));  // true
		System.out.println(s.startsWith("p"));  //false---it takes only String value and not char value 
		System.out.println(s.endsWith("h"));   //false--it takes only String value and not char value 
		System.out.println(s.startsWith("Pe"));
		
	}

}
