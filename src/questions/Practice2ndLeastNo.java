package questions;

public class Practice2ndLeastNo {

	public static void main(String[] args) {
		
		int T;
		int[] a= {34,45,32,54,36,76,65,69};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					T=a[i];
					a[i]=a[j];
					a[j]=T;
					
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
