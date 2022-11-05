package OOPS_Abstract;

abstract class Sports {
	 
   abstract	void team();
}

// also concept of method overriding is used here

class Cricket extends Sports {
	void team () {
		System.out.println("11 players are required in one team to play Cricket");
	}
}

public class Badminton extends Sports {
	
	void team () {
		System.out.println("BAdminton can be played in a team as double players as well as singles");
	}

	public static void main(String[] args) {
	//	 Sports s=new Sports();  we cannot create an object of an abstract class
		Sports c=new Cricket();// but instead of child class name we can use abstract class' name as a reference name
		c.team();
		Sports b=new Badminton();// that's we can use "Sports" instead of "Badminton" or "Cricket"
		b.team();
	}

}
