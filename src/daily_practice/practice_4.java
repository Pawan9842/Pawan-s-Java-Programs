package daily_practice;

public class practice_4 {
	
	int a=10;
	int b=5;
	
	public void Addition(int a,int b) {
		System.out.println(a+b);
	}
	public void Subtraction(int a,int b) {
		System.out.println(a-b);
	}
	public void Division(int a,int b) {
		System.out.println(a/b);
	}
	public void Multiplicatin(int a,int b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		practice_4 test=new practice_4();
		test.Addition(10, 5);
		test.Subtraction(10, 5);
		test.Division(10, 5);
		test.Multiplicatin(10, 5);
		

	}

}
