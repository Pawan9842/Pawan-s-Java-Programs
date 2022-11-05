package questions;

public class pr_REturn {
	
	int age() {
		return 10;
	}
	String name() {
		return "Penny";
	}
	void School() {
		System.out.println("School name is MCBC");
	}

	public static void main(String[] args) {
		pr_REturn a=new pr_REturn();
		System.out.println("Age of a Student is "+a.age());
		System.out.println("Name of a Student is "+a.name());;;;
		a.School();
		}
	

}
