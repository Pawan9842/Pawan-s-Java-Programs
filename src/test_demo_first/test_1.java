package test_demo_first;

public class test_1 {

	public int a=10;
	protected int b=20;    //here we want to print the values outside the package by subclass
	int c=30;              // thus in one project we created two packages 
	private int d=40;          // and in both the packages we created one class each
	                       // this is the class of first package and without public static void main type
	                       // we will print the values of this class in the next package's class
}
