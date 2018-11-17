package com.pro.test;

public class DecimalToBinaryConvert {

	public static void main(String[] args) {
	
		int n=50;
		int t=n;
		int rem=0;
		String binanry="";
		
				
		while(n>0) {
			
			rem=n%2;
			binanry=rem+binanry;
			n=n/2;
		}

		System.out.println(t+"---"+binanry);
	}

}
