package com.pro.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifingFileData {
	//https://javaconceptoftheday.com/modify-replace-specific-string-in-text-file-in-java/
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\in.txt"));
		String oldContext="";
		String lines=reader.readLine();
		while(lines!=null) {
			
			oldContext=oldContext+lines+System.lineSeparator();
		lines=reader.readLine();
		}
		
		String modifiedContent=oldContext.replaceAll("Mahesh", "Nani");
		
		BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\out1.txt"));
		
		writer.write(modifiedContent);
		reader.close();
		writer.close();
		System.out.println("sucess");
	}
}
