package com.pro.test;

public class FindMissNumbersInArray {

	public static void main(String[] args) {
		
		int n=10;
		int a[]= {1,2,10,3,6,4,5,8,9};
		int missedElement=sumOfNo(n)-sumOfArray(a);
		System.out.println(missedElement);
		
	}
	public static int sumOfNo(int n) {
		int no=0;
		 no=(n*(n+1))/2;
		
		return no;
	}
	public static int sumOfArray(int n[]) {
		int sum=0;
		
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
		}
		
		return sum;
	}

}
