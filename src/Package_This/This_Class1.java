package Package_This;

class A1 {
	int a;
	void numbers (int a) {
		this.a=a;
		System.out.println(a);
	}
}

public class This_Class1 {
	
	public static void main(String[] args) {
		A1 i=new A1();
		i.numbers(1);
		
	}

}
