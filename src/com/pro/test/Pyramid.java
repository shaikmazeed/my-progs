package com.pro.test;

public class Pyramid {
//https://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
	public static void main(String[] args) {
		int rows=6;
		int rowCount=1;
		
		for(int i=rows;i>0;i--) {
		
			//printing white spaces ""
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowCount;j++) {
				System.out.print(j+" ");
			//	System.out.print(rowCount+" ");
				//System.err.println("* ");
			}
			System.out.println();
			rowCount++;
		}
		

	}

}
