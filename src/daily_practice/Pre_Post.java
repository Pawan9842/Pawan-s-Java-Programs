package daily_practice;

public class Pre_Post {

	public static void main(String[] args) {
		
		int a=10; 
		int b=11;
	
//		System.out.println(a++ + a++);  //10+11
//		System.out.println(a++ + ++a);  //
//		System.out.println(++b + ++b);  //
//		System.out.println(b++ + ++b); //11+13
//		System.out.println(b++ + b++); //11+12
//		a+=2; //a=a+2
//		System.out.println(a);
//		System.out.println(a-=b);;
		System.out.println(a<b|b<a);//
		System.out.println(a<b & b<a);
		
		System.out.println(5<<2);
		
		int c=-7;
		int d=-9;
/*		if (c<0) {
			System.out.println(c+" is less than Zero");
		}
		else {
			System.out.println(c+" is greater than Zero");
		} */
		int m=(c>d)?c:d;
		System.out.println(m);
	}

}
