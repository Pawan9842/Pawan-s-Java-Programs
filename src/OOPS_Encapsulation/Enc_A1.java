package OOPS_Encapsulation;

public class Enc_A1 {
	
	private int emp_id;  // data hiding
	
	public void setemp_id(int emp_id) {
		this.emp_id=emp_id;
	}
	public int getemp_id() {
		return emp_id*2;
	}

	public static void main(String[] args) {
		Enc_A1 e=new Enc_A1();
		e.setemp_id(6);
		System.out.println(e.getemp_id());
		
	}

}
