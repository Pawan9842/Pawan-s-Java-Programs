package daily_practice;

public class Practice_Arrays_STrings {

	public static void main(String[] args) {
		
		String[][] a= {{"Pawan","Nitisha","Doctor"},{"Engineer","IT"}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		
	}
}
