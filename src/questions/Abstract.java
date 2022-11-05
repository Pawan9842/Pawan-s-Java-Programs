package questions;

abstract class Travels {
	abstract void hillStation();
	 String s;
}


public class Abstract extends Travels {
	
	void m1(String s) {
		super.s=s;
		System.out.println(s);
	}
	
	public void hillStation() {
		
		System.out.println("Nainital is heaven on Earth");
	}

	public static void main(String[] args) {
		
		Abstract a=new Abstract();
		a.m1("Uttarakhand");
		a.hillStation();
		
		

	}

}
