package questions;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		
		int heightcm;
		int heightM;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height in M");
		heightM=s.nextInt();
		heightcm=heightM*100;
		System.out.println("Height in cm is "+heightcm);
		
	}

}
