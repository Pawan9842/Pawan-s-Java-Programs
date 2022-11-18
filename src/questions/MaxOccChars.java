package questions;

public class MaxOccChars {

	public static void main(String[] args) {
		
		String s="engineer";
		System.out.println(s);
		int[] a=new int[127];   //empty 127 blocks containing 0
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)]=a[s.charAt(i)]+1;   //a[e]   | |0+1+1+1 | |0+1+1 | |0+1 | | |
		}
		int m=-1;
		char ch=' ';
		for(int i=0;i<s.length();i++) {
			
			if(m<a[s.charAt(i)]) {
				m=a[s.charAt(i)];   //3
				ch=s.charAt(i);     //e
			}
		}
		System.out.println("Maximum Ocurred Character in "+s+" is "+"'"+ch+"'");
		System.out.println(a[s.charAt(6)]);
	}

}
