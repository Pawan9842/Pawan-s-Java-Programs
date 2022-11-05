package questions;

public class PrimeNo1_10 {

	public static void main(String[] args) {
		
		 int t;
	        System.out.println("All Prime Numbers Between 1 and 100");
	        
	        //2  3   4]  5   6]   7   8]   9]   10]    11 -----
	       
	        for(int i = 2; i <= 100; i++) {  //7
	           t=0;
	            // Check whether i is prime or not
	            for (int j = 2; j <i; j++) {  //2<=3
	              
	                if (i % j == 0) {    //6%2=0  
	                    t = 1;          //6/2=3
	                    break;          //5%2=1
	                }                  //5/2=2
	                				   //9%7=2
	            }				      //9/7=1
	            					 //9%11=9
	            				    //9/11=0
	            if (t == 0)
	                System.out.print(i + " ");  //2_3_5_
	        }
	}

}
