package com.pro.test;

public class FindLatNumbersMatchOrNot {

	public static void main(String[] args) {
		
		System.out.println(find(11,21));
	}
		private static boolean find(int n1,int n2) {
			boolean flag=false;
			
			if((n1%10)==(n2%10)) {
				flag=true;
			}
			
			return flag;
		}

	}

