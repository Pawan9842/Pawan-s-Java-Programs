package Package_This;

public class B2 {

	// for current class methods
	
	public void m1() {
	System.out.println("m1");
	System.out.println("I am a Doctor");
	System.out.println("I like my job");
	}
	
	public void m2() {
		this.m1();
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		B2 b=new B2();
		b.m2();
		
	}

}
