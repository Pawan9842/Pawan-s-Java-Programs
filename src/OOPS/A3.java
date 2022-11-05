package OOPS;

class A4 {   // m4; m5
	public void m4() {
		System.out.println("m4");
	}
	public void m5() {
		System.out.println("m5");
	}
}
class A5 extends A4 {  //m4; m5; m6; m7
	public void m6() {
		System.out.println("m6");
	}
	public void m7() {
		System.out.println("m7");
	}
}

public class A3 extends A5 {  //m4; m5; m6; m7; m8
	
	public void m8() {
		System.out.println("A3 is the child");
	}

	public static void main(String[] args) {
		System.out.println("Multilevel Inheritance");
		A3 a1=new A3();
		a1.m4();
		a1.m5();
		a1.m6();
		a1.m7();
		a1.m8();
		
	}

}
