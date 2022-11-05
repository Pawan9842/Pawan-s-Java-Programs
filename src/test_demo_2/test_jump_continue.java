package test_demo_2;

public class test_jump_continue {

	public static void main(String[] args) {
		
		//jump statement
		// 2) continue: for loop will execute the code until the condition 
		//              becomes true and once the condition becomes true
		//              it will print the statement and again will continue in the for loop
		
		for (int i=0; i<=5; i++) {
			
			if (i==3) {
				
				continue;   // if condition becomes true then it will not print below
				            // code and instead will directly 
				            //move towards increment thus will not print 3 in this case
			}
			System.out.println(i);
		}

	}

}
