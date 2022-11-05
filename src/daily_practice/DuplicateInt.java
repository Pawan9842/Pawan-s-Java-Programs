package daily_practice;

public class DuplicateInt {

	public static void main(String[] args) {
		
		int t;
		int a []= {1,4,3,2,5,6,3,4};
		
		System.out.println(a.length);
		 
		for(int i=0;i<a.length;i++) {
			t=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					t=t+1;
					break;
				}
			}
			if(t>0) {
				System.out.println(a[i]+" is duplicate");
			}
		}
		
	}

}
