package questions;
 
class Values {
	
	public int c=30;
	int d=40;
	protected int e=60;
	
}

public class ENCAP1 {
	
	private static int a=20;

	public static void main(String[] args) {
		System.out.println(ENCAP1.a);
		Values v=new Values();
		System.out.println(v.c);
		
	}

}
