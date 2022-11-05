package Package_This;

public class B1 {
	// this. keyword refers to the current class' instance variable
	
	int a;
	String s;
	void m1(int a,String s) {
		this.a=a;
		this.s=s;
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String[] args) {
		B1 b=new B1();
		b.m1(10,"Boss");
	}

}
