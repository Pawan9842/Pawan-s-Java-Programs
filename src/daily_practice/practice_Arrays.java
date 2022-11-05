package daily_practice;

public class practice_Arrays {

	public static void main(String[] args) {
		
		/*int[] roll= {1,2,3,4,5};
		System.out.println(roll[0]+" "+roll[1]+" "+roll[2]+" "+roll[3]+" "+roll[4]);
		for (int i=0;i<roll.length;i++) {
			System.out.print(roll[i]+" ");
		}*/
		
		//int[][] a;
	//	a= new int[2][3];
		            
		int[][] a={{1,2,9,3},{4,5,6,3,2,5},{7,8}};  // jagged array
	/*	System.out.println(a[0][1]);
		System.out.println(a[1][2]);
		System.out.println(a[0][1]+","+a[1][1]);*/
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");  //i=1, j=0
			}
			System.out.println();
		}
		
	}

}
