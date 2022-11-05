package Package_This;

// super. keyword refers to parents class' instance variable

class B5 {
	String a;
}

public class B4 extends B5 {
	
	public void m1(String a) {
		super.a=a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		B4 b=new B4();
		b.m1("Palghar");

	}

}
