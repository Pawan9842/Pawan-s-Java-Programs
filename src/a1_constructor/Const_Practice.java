package a1_constructor;

public class Const_Practice {
	String name;
	int physics;
	int chemistry;
	int maths;
	int english;

	
	
	Const_Practice(String name, int physics, int chemistry, int maths, int english) {
		 this.name=name;
		 this.physics=physics;
		 this.chemistry=chemistry;
		 this.maths=maths;
		 this.english=english;
		
		System.out.println(this.name+" "+this.physics+" "+this.chemistry+" "+this.maths+" "+this.english);
	}
	

	public static void main(String[] args) {
		Const_Practice a1=new Const_Practice("Rachel:",32,43,54,45);
		Const_Practice a2=new Const_Practice("Phoebe:",38,93,84,95);
	}

}
