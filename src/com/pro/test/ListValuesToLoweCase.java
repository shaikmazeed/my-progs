package com.pro.test;

import java.util.ArrayList;

public class ListValuesToLoweCase {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("MAZEED");
		al.add("BOBBY");
		al.add("SHAIK");
		
		for(String o:al) {
			System.out.println(o.toLowerCase());
		}
		
	}

}
