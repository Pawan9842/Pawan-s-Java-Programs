package practice_AM;

class A1 {
	
	String name;
	int eng;
	int maths;
	static String school="St john";

	A1 (String name, int eng, int maths) {
		this.name=name;
		this.eng=eng;
		this.maths=maths;
	}
	void m1() {
		System.out.println(name+" "+eng+" "+maths+" "+school);
	}

	
	public static void main(String[] args) {
		A1 a1=new A1("Sonu: ",23,43);
		A1 a2=new A1("MOnu: ",11,9);
		
	}

}
