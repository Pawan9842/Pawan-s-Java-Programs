package practice_loopings;

public class practice_DoWhile_Loop {

	public static void main(String[] args) {
		
		//sometimes we want our program to execute a few set of instructions again and again 
		//eg 1: 1 to 1000, print multiplication table etc. Loops make it easy for us to tell our computer that a given 
		//set of instructions need to be executed repeatedly.
		//eg 2: for printing even or odd numbers 
		
		// do while loop is similar to while loop except the fact that it is guaranteed to execute at least once
		
		// syntax
		// do {
		//   //code                               // while checks the condition and executes the code
		//} while (condition)                     // do while executes th code and then checks the condition
		
	//	int i=10;
	//	do {
	//		System.out.println(i);
	//		i++;
	//	} while (i<15);
		
	//	System.out.println("stop do while execution");
		
		// print first n natural numbers
		
		int i=1;
		do {
			System.out.println(i-1);
			i++;
		} while (i<12);
			System.out.println("printed whole numbers upto 10");

	}

}
