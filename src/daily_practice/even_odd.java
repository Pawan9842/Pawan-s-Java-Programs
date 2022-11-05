package daily_practice;

public class even_odd {

	public static void main(String[] args) {
		//even numbers from 120 to 150
		for (int i=120;i<=150;i=i+2) {
			                   
				System.out.print(" "+i);
			
		}
		System.out.println();
		
		// odd numbers from 20 to 50
		for(int j=21;j<50;j++) {
			if(j%2!=0) {
				System.out.print(" "+j);
			}
		
		}
		System.out.println();
		
		//odd numbers from 100 to 50
		for(int k=99;k>50;k--) {
			if(k%2!=0) {
				System.out.print(" "+k);
			}
		
		}
		}
	}


