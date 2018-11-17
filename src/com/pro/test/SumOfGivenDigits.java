package com.pro.test;

public class SumOfGivenDigits {

	public static void main(String[] args) {
		
		sum(1234);

	}
	private static void sum(int number) {
		int sum=0;
		int copyNumber=number;
		
		while(copyNumber!=0) {
			int lastDigit=copyNumber%10;
			sum=sum+lastDigit;
			copyNumber=copyNumber/10;
		}
		System.out.println("sum of digits is "+sum);
	}

}
