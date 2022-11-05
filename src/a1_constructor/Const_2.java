package a1_constructor;

public class Const_2 {
	
	
	
	Const_2(int a, String name, char c) {
		
	
		System.out.println("Student's name is "+name+" and her age is "+a+".She studies in grade "+"'"+c+"'");
		
	}
	
	public static void main(String[] args) {
		
		Const_2 a=new Const_2(45, "Elena", 'A');
		Const_2 b=new Const_2(41, "Helen", 'B');

	}

}
