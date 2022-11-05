package test_demo_2;

public class test_Demo_Stringg_3 {

	public static void main(String[] args) {
		String s="Pawan123@gmail.com";
		
		//split's return type is argument
		String [] a=s.split("1");//split string into substring based on passed argument
		                         //into parts such as 0,1,2
		System.out.println(a[0]);// first part represented by 0
		System.out.println(a[1]);// second part by 1
		//System.out.println(a[2]);// third part
		//System.out.println(a[3]);// fourth part
		
		//trim(); removes spaces from start and end
		String s1="  Paw an  ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		// replace("old","new");
		System.out.println(s1.replace(" ", ""));
		System.out.println(s1.replace(" ", "L"));
		System.out.println(s1.replace("  Paw an  ", "Pn"));
		
		//startsWith(string);
		String b="Hey @Elena";
		System.out.println(b.startsWith("H"));
		
		
				

	}

}
