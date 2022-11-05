package Exception_Handling;

public class EH_3 {

	public static void main(String[] args) {
		EH_3 o=new EH_3();
		o.divide();
		System.out.println("Divide Method");
	}
	 void divide () {
		try {
		int a=30,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Divisor can't be Zero");
		}
	}
	
}
