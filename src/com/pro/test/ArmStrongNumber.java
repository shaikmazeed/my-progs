package com.pro.test;

public class ArmStrongNumber {

	public static void main(String[] args)
	{

		findArm(371);
	}
	public static void findArm(int n) {
		int a=0;
		int c=0;
		int temp=n;
		while(n!=0) {
			
			a=n%10;
			c=c+(a*a*a);
			n=n/10;
		}
		if(temp==c) {
			System.out.println("arm");
		}
		else {
			System.out.println(" not arm");
		}
		
	}

}
