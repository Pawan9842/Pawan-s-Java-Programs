package Task_1;

public class MaxOccurrChar {

	public static void main(String[] args) {
		
		String s="Rachhel is Love";
		s=s.replaceAll(" ", "");
		System.out.println(s);                      
		int[] ar=new int[127];         
		for(int i=0;i<s.length();i++) {
			ar[s.charAt(i)]=ar[s.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<s.length();i++) {//5              nitisha
			if(max<ar[s.charAt(i)]) {        //ar[ n   ]=87th block
				max=ar[s.charAt(i)];  //2 
				ch=s.charAt(i);  //h
			}
		}
		System.out.println("Maximum occurred character is "+ch);
	}

}
