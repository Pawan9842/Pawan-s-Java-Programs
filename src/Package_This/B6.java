package Package_This;
class B7 {
	// used to call parent class methods
	public void m1() {
		System.out.println("I love Beaches");
	}
}

public class B6 extends B7 {
	public void m2(int a) {
		super.m1();
		System.out.println("I love Mountains");
	}

	public static void main(String[] args) {
		B6 b=new B6();
		b.m2(9);

	}

}
