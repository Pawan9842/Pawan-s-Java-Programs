package test_demo_2;

public class test_jump_break {

	public static void main(String[] args) {
		
		// jump statements
		// 1) break- for loop will execute the code until the condition becomes true
		
		for (int i=0; i<=500; i++) {
			
			if (i==4) {          // when i becomes equal to 4 it will now not print 4
				                 // instead of printing 4 it will directly break means it will
				break;             // get out of the for loop
				
			}
			System.out.println(i);
		}

	}

}
