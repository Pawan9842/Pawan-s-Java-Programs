package Package_This;

public class B3 {
	// this. keyword to invoke current class' constructor 
	
	B3() {
		System.out.println("Mango");
	}
	B3(int a) {
		this();
		System.out.println("Apple");
	
	}
	B3(String s) {
		this(9);
		System.out.println("I like fruits");
	}

	public static void main(String[] args) {
		B3 b1=new B3(7);
		B3 b2=new B3("k");
	}

}
