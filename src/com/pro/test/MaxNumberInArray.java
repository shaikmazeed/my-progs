package com.pro.test;

import java.util.ArrayList;

public class MaxNumberInArray {

	public static void main(String[] args) {
		
		System.out.println(findBig(new int[] {-2,2,1,3}));

	}
	private static boolean findBig(int n[]) {
	int largest=n[0];
	int sum=0;
	int index=0;
	boolean flag=false;
	
	for(int i=1;i<n.length;i++) {
		if(n[i]>largest) {
			largest=n[i];
			index=i;
		}
	}
	for(int i =0;i<n.length;i++) {
		if(!(index==i)) {
		sum=sum+n[i];
		}
	}
	if(sum==largest) {
		flag=true;
	}
	
		return flag;
	}
	
	
}
