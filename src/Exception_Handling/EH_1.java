package Exception_Handling;

public class EH_1 {

	public static void main(String[] args) {
		
		try {
		int a=10;
		int b=0;
		int c;
		String s="Monkey";
		System.out.println(s);
		c=a/b;
		System.out.println(c);
		System.out.println("Monkeys like banana");
		}
		catch(Exception e) {
			System.out.println("Divisor cannot be Zero");
		}
		finally {
			System.out.println("Nitiha also like bananas");
		}
	}

}
