package OOPS_interface;
// interface is used to achieve abstraction
//100% abstraction can be achieved by using interface
//only other than public methods (default, static) have bodies
interface inter1 {
	void school (); // method is assumed as "public abstract" even if not written
	String S="Jawahar Navodaya Vidyalaya";
}
interface inter2 {
	int a=30;   // compiler assumes this variable as "public static final" type
	public abstract void students ();
}

public class A1_inter implements inter1, inter2 {
	
	public void school () {  //if public not written then it will show error, since child class should have upper AM 
								// compared to parent class
		System.out.println("Schools main focus should be-'Education over Literacy'");	
	}
	public void students () {  // if public not written then it will show error
		System.out.println("students need to focus on overall personality development.");
	}

	public static void main(String[] args) {
		A1_inter o1=new A1_inter ();
		System.out.println(S);
		System.out.println("There are "+a+" students in each class");
		o1.school();
		o1.students();
		
	}

}
