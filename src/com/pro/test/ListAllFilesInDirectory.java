package com.pro.test;

import java.io.File;
import java.io.FilenameFilter;

public class ListAllFilesInDirectory {
	//https://javaconceptoftheday.com/list-all-files-in-directory-in-java/
	//https://javaconceptoftheday.com/set-file-permissions-in-java/
	
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Mazeed Sk\\Downloads\\Sriman\\JS\\Programs\\src\\files\\in.txt");
		//file.getName();
		System.out.println(file.getName());
	}
}