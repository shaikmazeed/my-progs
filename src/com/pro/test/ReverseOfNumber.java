package com.pro.test;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		int no=reverse(1234);
		System.out.println(no);
	}
	private static int reverse(int number) {
		int no=0;
		int rem=0;
		
		while(number!=0) {
			rem=number%10;
			no=no*10+rem;
			number=number/10;
			
		}
		
		return no;
	}

}
