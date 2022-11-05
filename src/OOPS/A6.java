package OOPS;

class A7 {
	public void m9() {
		System.out.println("m9");
	}
}
class A8 extends A7 {  // m9; m10
	public void m10() {
		System.out.println("A8 is the child class m10");
	}
}

public class A6 extends A7 { //m9; m11
	public void m11() {
		System.out.println("A6 is the child class m11");
	}

	public static void main(String[] args) {
		System.out.println("Hierarchical Inheritance");
		A8 a2=new A8();
		a2.m9();
		a2.m10();
		A6 a3=new A6();
		a3.m11();
		a3.m9();
	}

}

