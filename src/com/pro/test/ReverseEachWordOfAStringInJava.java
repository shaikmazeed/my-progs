package com.pro.test;

public class ReverseEachWordOfAStringInJava {

	public static void main(String[] args) {
		String data="Java Is Good Language";
		StringBuffer bf=new StringBuffer();
		String eData[]=data.split(" ");
		for(String e:eData) {
			char c[]=e.toCharArray();
			for(int i=c.length-1;i>=0;i--) {
				
			 bf.append(c[i]);
			}
			bf.append(" ");
		}
		
		System.out.println(bf);
	}

}
