package Task_1;

public class ListOf10Students {
	
	String name;
	int Maths, History, Science;
	
	ListOf10Students(String name, int Maths, int History, int Science) {
		this.name=name;
		this.Maths=Maths;
		this.History=History;
		this.Science=Science;
		System.out.println(this.name+" "+this.Maths+" "+this.History+" "+this.Science);
	}

	public static void main(String[] args) {
		
		ListOf10Students a1=new ListOf10Students("Rachel:",32,34,50);
		ListOf10Students a2=new ListOf10Students("Ross:",44,45,46);
		ListOf10Students a3=new ListOf10Students("Monica:",32,32,43);
		ListOf10Students a4=new ListOf10Students("Chandler:",45,46,47);
		ListOf10Students a5=new ListOf10Students("Joey:",45,26,47);
		ListOf10Students a6=new ListOf10Students("Phoebe:",41,46,47);
		ListOf10Students a7=new ListOf10Students("Sheldon:",43,46,47);
		ListOf10Students a8=new ListOf10Students("Penny:",45,36,37);
		ListOf10Students a9=new ListOf10Students("Howard:",25,43,47);
		ListOf10Students a10=new ListOf10Students("Rajesh:",45,49,47);

	}

}
