package com.pro.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortFileElements {

	public static void main(String[] args) throws IOException {
	
		ArrayList<String> al=new ArrayList<String>();
		
		BufferedReader reader=new BufferedReader(new FileReader(new File("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\in.txt")));
		
		String currentLine=reader.readLine();
		while(currentLine!=null) {
			al.add(currentLine);
			currentLine=reader.readLine();
		}
		BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\out.txt"));
		Collections.sort(al);
		
		for(String data:al) {
			writer.write(data);
			writer.newLine();
		}
		System.out.println("sucess");
		reader.close();
	writer.close();
	}

}
