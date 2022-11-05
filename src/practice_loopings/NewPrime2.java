package practice_loopings;

public class NewPrime2 {

	public static void main(String[] args) {
		int t;
		for(int i=2;i<=30;i++) {
			t=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					t=1;
					break;
				}
				
			}
			if(t==0) {
				System.out.print(i+" ");
			}
		}

	}

}
