package OOPS_Polymorphism;

// method overriding
// no. of arguments should be same
//  sequence of arguments should be same
//	 types of args should be same
//   inheritance is used
	class Poly_3 {
	public void animal (String s, int e) {
		System.out.println("Dog is my friend");
	}
}

public class Poly_2 extends Poly_3 {
	
	public void animal (String t, int y) {
		System.out.println("I do not like cats");
	}

	public static void main(String[] args) {
	
		Poly_2 a=new Poly_2();
		a.animal("h", 7);
		a.animal("m", 0);
		
		
	}
	
}
