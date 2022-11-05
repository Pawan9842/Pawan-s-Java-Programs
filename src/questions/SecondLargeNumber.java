package questions;

public class SecondLargeNumber {

	public static void main(String[] args) {
		int t;
		int[] a= {220,34,56,43,65,76};
		for(int i=0;i<a.length;i++) {//1
			for(int j=i+1;j<a.length;j++) {//2
				
				if(a[i]<a[j]) {
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
		System.out.println("Second Last value is "+a[1]);
			
	}

}
