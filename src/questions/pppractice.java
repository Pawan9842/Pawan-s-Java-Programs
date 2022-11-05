package questions;

public class pppractice {

	public static void main(String[] args) throws InterruptedException {
		
		byte a=127;
		byte b=127;
		int c=a+b;
//		byte d=a+b;    compile time error
		System.out.println(c);
		try {
			System.out.println(10);
		Thread.sleep(-2000);
		int d=a-b;
		System.out.println(d);
		System.out.println(10);
		}
		catch(Exception e) {
		e.printStackTrace();	
		}
		System.out.println(67);
	}

}
