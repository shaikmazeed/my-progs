package com.pro.test;

import java.util.Arrays;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		
		//String[] String=find(new String[] {"1","2","3","3","4"});
		int data[]=findIntegers(new int[] {1,2,2,3,3});
		
		for(int i=0;i<data.length;i++) {
			if(data[i]>0) {
			System.out.println(data[i]);
			}
		}
		
		
		
				
	}
	public static String [] find(String data[]) {
		
		String duplicates[]=new String[5];
		
		
		for(int i=0;i<data.length;i++) {
			
			for(int j=i+1;j<data.length;j++) {
				
				if(data[i].equals(data[j])){
					System.out.println(data[i]);
				}
				
			}
	}
		
		return duplicates;
	}
	
	
	public static int [] findIntegers(int data[]) {
		
		int duplicates[]=new int[5];
		int count=0;
		
		for(int i=0;i<data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j] && (i!=j)) {
					duplicates[count]=data[j];
					count++;
				}
			}
		}
		
		return duplicates;
	}

}
