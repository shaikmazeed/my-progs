package com.pro.test;

import java.util.HashMap;

public class DuplicateChaaractersInString {

	public static void main(String[] args) {
		findDuplicateChars("JAVA IS SIMPLE LANGUAGE");

	}
	private static void findDuplicateChars(String data) {
		
		HashMap<Character,Integer> dataMap=new HashMap();
		char c[]=data.toCharArray();
		
		for(Character key:c) {
			if(key!=' ') {
			if(dataMap.containsKey(key)) {
				dataMap.put(key, dataMap.get(key)+1);
			}else {
				dataMap.put(key, 1);
			}
		}
	
	
	}
		for(Character keys:dataMap.keySet()) {
			if(dataMap.get(keys)>1) {
				System.out.println(keys+"---"+dataMap.get(keys));
			}
		}/*for(Character keys:dataMap.keySet()) {
			if(dataMap.get(keys)>1) {
				System.out.println(keys+"---"+dataMap.get(keys));
			}
		}*/
	}
	
}
