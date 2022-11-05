package Package_This;

class B9 {
	//super keyword for invoking parent class'constructor
	
	B9(String quality) {
		System.out.println("Doctors can be "+quality);
	}
}

public class B8 extends B9  {
	
	B8(char a) {
		super("Intelligent");
		System.out.println("I like Hiking and Trekking");
	}

	public static void main(String[] args) {

		
		B8 b=new B8('j');
		

	}

}
