package OOPS_Polymorphism;

public class POLY_1 {
	
	// method overloading
	//no. of arguments should be different
	// sequence of arguments should be differet
	// types of args should be different
	public void login(int a,String b) {
		System.out.println("open home page");
	}
	public void login(String a,int b) {
		System.out.println("home page");
	}
	public void login(int c) {
		System.out.println("Char");
	}
	public static void main(String[] args) {
		 
		POLY_1 a=new POLY_1();
		a.login("e",0);
		a.login(8,"g");  // if char value is called it will get converted into int and print the corresponding value
		a.login('s');   		   // it is known as automatic promotion
	}

}
