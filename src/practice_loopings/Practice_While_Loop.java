package practice_loopings;

public class Practice_While_Loop {

	public static void main(String[] args) {
		
		//sometimes we want our program to execute a few set of instructions again and again 
		//eg 1: 1 to 1000, print multiplication table etc. Loops make it easy for us to tell our computer that a given 
		//set of instructions need to be executed repeatedly.
		//eg 2: for printing even or odd numbers 
		//syntax
		// while(condition)
		//{
		// code   -----this will keep on executing as long as condition is true
		//}
		
		int i=15;         // printing first 10 natural numbers
		while(i<20) {
			
			System.out.println(i);                            // // while checks the condition and executes the code
			i++;                                              // // while checks the condition and executes the code
		}
		 System.out.println("finish running while loop");   

	}

}
