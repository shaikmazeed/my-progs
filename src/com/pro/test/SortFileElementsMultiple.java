package com.pro.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int marks;
	String name;
	public Student(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
}

class MarksCompare implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s2.marks-s1.marks;
	}
	
}

public class SortFileElementsMultiple {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\mulIn.txt"));
		
		String currentLine=reader.readLine();
		
		while(currentLine!=null) {
			String data[]=currentLine.split(" ");
			String name=data[0];
			int marks=Integer.parseInt(data[1]);
			al.add(new Student(marks, name));
			currentLine=reader.readLine();
		}
		BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\mulOut.txt"));
		Collections.sort(al, new MarksCompare());
		for(Student s:al) {
		writer.write(s.name);
		writer.write(" "+s.marks);
		writer.newLine();
		}
		System.out.println("sucess");
		reader.close();
		writer.close();
	}
}
