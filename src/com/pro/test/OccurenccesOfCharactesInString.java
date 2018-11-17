package com.pro.test;

import java.util.HashMap;
import java.util.Map;

public class OccurenccesOfCharactesInString {
	
	public static void main(String[] args) {
	
		findChars("Hello Mazeed");
	}
	private static void findChars(String data) {
		
		Map<Character,Integer> dataMap=new HashMap();
		
		char c[]=data.toCharArray();
		
		for(Character key:c) {
			if(key!=' ') {
			if(dataMap.containsKey(key)) {
				dataMap.put(key, dataMap.get(key)+1);
			}
			else {
				dataMap.put(key, 1);
			}
		}
		System.out.println(dataMap);
		}
	}
}
