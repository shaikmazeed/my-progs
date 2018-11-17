package com.pro.test;

public class ElementsOfArrySumIsGivenNumber {

	public static void main(String[] args) {
		find(new int[] {10,9,10,29,-9,23,3},20);

	}
	private static void find(int values[],int no) {
		
		System.out.println("sum of elements for "+no+" are");
		for(int i=0;i<values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
				
				if(values[i]+values[j]==no) {
					System.out.println(values[i]+" + "+values[j]+" = "+no);
				}
			}
		}
	}

}
