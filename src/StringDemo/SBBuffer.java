package StringDemo;

public class SBBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("Doctor");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("I don't know why you are making such mistake.");
		System.out.println(sb1.append(" I think you just enjoy bothering me."));
	}

}
