package test_demo_2;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// ArithmeticOperator: +,-,/,%,*
		
		int a=10;
		int b=3;
		
		System.out.println(a+b);//30
		System.out.println(a-b);//-10
		System.out.println(a/b);//3
		System.out.println(b%a);//10
		System.out.println(a*b);//200
		
           // relational operators <,>,<=,>=,==,!=
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		
		// logical operator And (&&) Or (||)
		//And &&
        System.out.println(a<b && a<=b);// T && T---> T
		System.out.println(a<b && a>=b);// T && F---> F
		System.out.println(a>b && a<=b);// F && T---> F
		System.out.println(a>b && a>=b);// F && F--->F
		
		// Or ||
		System.out.println(a<b || a<=b);// T || T ---> T
		System.out.println(a<=b || a>b);// T || F ---> T
		System.out.println(a>b || a<=b);// F || T ---> T
		System.out.println(a>=b || a>b);// F || F ---> F
		
		
		
		
		
	}

}
