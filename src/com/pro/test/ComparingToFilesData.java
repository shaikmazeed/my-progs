package com.pro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ComparingToFilesData {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader1=new BufferedReader(new FileReader("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\in.txt"));
		BufferedReader reader2=new BufferedReader(new FileReader("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\in1.txt"));
		
		String line1=reader1.readLine();
		String line2=reader2.readLine();
		int lineNum=0;
		boolean areEQual=true;
		
		while(line1!=null || line2!=null) {
			
			if(line1==null || line2==null) {
				areEQual=false;
				break;
			}
			else if(!(line1.equals(line2))) {
				areEQual=false;
				break;
			}
			line1=reader1.readLine();
			line2=reader2.readLine();
			lineNum++;
		}
		if(areEQual) {
			System.out.println("content is same");
		}else {
			System.out.println("content not same at line number "+lineNum);
			System.out.println("at lines "+line1+"---"+line2);
			
		}
	}

}
