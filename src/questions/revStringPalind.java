package questions;

public class revStringPalind {

	public static void main(String[] args) {
				String s1= "MALAYALAM";
		       String rev= "";
		       for (int i=s1.length()-1; i>=0; i--)
		       {
			      
				rev= rev+s1.charAt(i);  //daD
			      
		       }
		       System.out.println(rev);
		       if(s1.equals(rev)) {
		    	System.out.println(s1+" is a Palindrome");
		    	
		       }else { 
			    	System.out.println(s1+" is not a Palindrome");

		       }  
/*		 char xyz[]=s1.toCharArray() ;     
		for(int i=s1.length()-1;i>=0;i--) {
		    	   rev=rev+s1.charAt(i);
		       }
		       System.out.println(rev);*/
		       
		       
		       
	}

}
