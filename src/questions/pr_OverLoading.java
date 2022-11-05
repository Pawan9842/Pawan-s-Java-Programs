package questions;

public class pr_OverLoading {
	void Student (int a) {
		System.out.println("Student's Age is "+a);
	}
	void Student(String b) {
		System.out.println("Student's Name is "+b);
	}
	public static void main(String[] args) {
		pr_OverLoading o=new pr_OverLoading();
		o.Student(18);
		o.Student("Penny");
	}

}
