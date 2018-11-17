package com.pro.test;

public class SelectionSort {

	public static void main(String[] args) {
		
		int n[]= {12,2,-1,20,3,7};
		int temp=0;
		for(int i=0;i<n.length-1;i++) {
			int pos=i;
			
			for(int j=i+1;j<n.length;j++) {
				
				if(n[j]<n[pos]) {
					pos=j;
				}
			}
			temp=n[i];
			n[i]=n[pos];
			n[pos]=temp;
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}

	}

}
