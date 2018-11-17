package com.pro.test;

import java.text.DecimalFormat;

public class PecentaigeOfCharactessPresent {

	public static void main(String[] args) {
		
		find("Tiger Runs @ The Speed Of 100 km/hour.");
	}
	public static void find(String data) {
		
		int totalChars=data.length();
		
		int upper=0;
		int lower=0;
		int didgits=0;
		int other=0;
		char c[]=data.toCharArray();
		for(char ch:c) {
		
		if(Character.isUpperCase(ch)) {
			upper++;
		}
		else if(Character.isLowerCase(ch)) {
			lower++;
		}
		else if(Character.isDigit(ch)) {
		didgits++;	
		}
		else {
			other++;
		}
		
		}
		
		double up=(upper*100.0)/totalChars;
		double lp=(lower*100.0)/totalChars;
		double dig=(didgits*100.0)/totalChars;
		double ot=(other*100.0)/totalChars;
		 DecimalFormat formatter = new DecimalFormat("##.##");
		System.out.println(formatter.format(up));
		System.out.println(formatter.format(lp));
		System.out.println(formatter.format(dig));
		System.out.println(formatter.format(ot));
		
	}

}
