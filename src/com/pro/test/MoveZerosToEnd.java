package com.pro.test;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	public static void main(String[] args) {
	
		move(new int[] {12,2,0,8,0,3,9});
	}
	private static void move(int numbers[]) {
		int count=0;
		
		for(int i=0;i<numbers.length;i++) {
		
			if(numbers[i]!=0) {
				numbers[count]=numbers[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(numbers));
		while(count<numbers.length) {
			numbers[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(numbers));	
	}
}

