package daily_practice;

abstract class bank{
	abstract void ROI();
}

class HDFC extends bank {
	void ROI () {
		System.out.println("ROI of HDFC is"+6+"%");
	}
}

public class SBI_abstract extends bank {
	void ROI () {
		System.out.println("ROI of HDFC is"+8+"%");

	}

	public static void main(String[] args) {
		bank a=new HDFC();
		bank b=new SBI_abstract ();
		a.ROI();
		b.ROI();
		
	}

}
