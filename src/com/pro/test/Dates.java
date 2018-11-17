package com.pro.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		
		Date today=new Date();
		System.out.println(today);
		
		/*SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(today));*/
	
		/*SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(format.format(today));*/

		/*SimpleDateFormat format=new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(format.format(today));*/
	
		/*SimpleDateFormat format=new SimpleDateFormat("E, dd:MM:yyyy");
		System.out.println(format.format(today));*/
	
		/*SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(format.format(today));*/
	
		/*SimpleDateFormat format=new SimpleDateFormat("EEEE,dd/MM/yyyy hh:mm:ss a");
		System.out.println(format.format(today));*/
	
		/*SimpleDateFormat format=new SimpleDateFormat("EEEE,dd/MM/yyyy hh:mm:ss z");
		System.out.println(format.format(today));*/
		
		SimpleDateFormat format=new SimpleDateFormat("EEEE,dd/MM/yyyy hh:mm:ss Z");
		System.out.println(format.format(today));
	}

}
