package OOPS;

class A2 {   // A2 is the parent class here
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
}

public class A1 extends A2 {  //m1; m2; m3 /// A2 is a child class
	
		public void m1() {
			System.out.println("m1");
		}
	public static void main(String[] args) {
		
		System.out.println("Single Inheritance");
		A1 a = new A1();
		a.m1();
		a.m2();
		a.m3();
		
	}

}
