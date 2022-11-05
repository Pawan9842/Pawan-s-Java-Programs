package test_demo_2;

public class Test_Demo_Stringg_2 {

	public static void main(String[] args) {
		
		String s1="Pawan_5@gmail.com";
		String s2="pawan_5@gmail.com";
		
		//length()---> given in int value
		System.out.println(s1.length());  // 17
		
		//equals()--->content comparison--case sensitive
		System.out.println(s1.equals(s2)); // False---Capital & Small leters
		
		//eualsIgnoreCase()---> content comparison, not case sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); // True---only content compared and not cases
		
		//charAt(index)---> shows what is positioned on a particular place
		System.out.println(s1.charAt(5));
		System.out.println(s2.charAt(7));
		
		//toLowerCase(); & toUpperCase();                                    //shsjsjs
		System.out.println(s1.toLowerCase());//pawan_5@gmail.com             //0123456
		System.out.println(s2.toUpperCase());//PAWAN_5@GMAIL.COM
		
		//endsWith(String)
		System.out.println(s2.endsWith(".com"));// True---> since the String name ends with ".com"
		
		String path="file/destn/folfer/test.pdf";
		
		if(path.endsWith(".pdf")) {
			System.out.println("file upload done");
		}else {
			System.out.println("only need pdf file to upload");
		}
		
		//concat(); combines both s1 and s2
		System.out.println(s1.concat(s2));
		System.out.println("Task Completed");

	}

}
