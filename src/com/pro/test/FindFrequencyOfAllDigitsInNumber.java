package com.pro.test;

public class FindFrequencyOfAllDigitsInNumber {
	//https://javaconceptoftheday.com/find-frequency-of-all-digits-in-number-in-java/
	public static void main(String[] args) {
		int no=1232739;
		int a[]=new int[10];
		
		while(no!=0) {
			int digit=no%10;
			a[digit]++;
			no=no/10;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
			System.out.println(i+"----"+a[i]);
			}
			}
	}

}
