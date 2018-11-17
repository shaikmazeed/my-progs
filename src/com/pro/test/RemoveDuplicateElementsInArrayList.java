package com.pro.test;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElementsInArrayList {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("java");
		al.add("c");
		al.add("vb");
		al.add("c#");
		al.add("c");
		al.add("java");
		
		HashSet h=new HashSet(al);
		ArrayList al1=new ArrayList(h);
		System.out.println(al1);
		
	}

}
