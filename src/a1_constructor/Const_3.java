package a1_constructor;

public class Const_3 {  // constructor name and class name are same
	                    // constructor doesn't have return type not even void
	String name;     
	int maths_marks;
	int marathi_marks;   // constructor is responsible for initialization
	int english_marks;
	static String school="JNV";
	Const_3(String name, int maths_marks, int marathi_marks, int english_marks, String school) {
		
		this.name=name;
		this.maths_marks=maths_marks;   //this.variablename is used to call the variable
		this.marathi_marks=marathi_marks;
		this.english_marks=english_marks;
		System.out.println(this.name+" "+this.maths_marks+" "+this.marathi_marks+" "+this.english_marks+" "+school);
		
	}
	public static void main(String[] args) {   // 
		
		Const_3 a1=new Const_3("Rachel:",69,79,89,school);    //"new" keyword is used to create the object
		Const_3 a2=new Const_3("Ross:",90,89,99,school);   
		Const_3 a3=new Const_3("joey:",36,54,45,school);
		Const_3 a4=new Const_3("Phoebe:",98,99,96,school);
		Const_3 a5=new Const_3("Chandler:",67,76,69,school);
		Const_3 a6=new Const_3("Monica:",88,77,99,school);
		Const_3 a7=new Const_3("Sheldon:",100,100,100,school);
		Const_3 a8=new Const_3("Penny:",22,33,44,school);
		Const_3 a9=new Const_3("Leanord:",98,89,69,school);
		Const_3 a10=new Const_3("Rajesh:",99,99,99,school);
	}

}
