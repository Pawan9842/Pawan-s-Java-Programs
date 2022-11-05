package questions;

public class SecondLeastNumber {

	public static void main(String[] args) {
		        //5,6,8,......
		int t;
		int[] a= {6,8,96,5,43,67,78,69};
		
		for(int i=0;i<a.length;i++) { //  [1   2   3    4    5   6 ]
			
			for(int j=i+1;j<a.length;j++) {    
				
				if(a[i]>a[j]) {             //  1   2   3   4 
					//swap= t_ a[i]_  a[j]_
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Second Least Number is "+a[1]);

	}

}
