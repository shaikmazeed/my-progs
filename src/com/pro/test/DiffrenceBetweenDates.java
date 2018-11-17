package com.pro.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiffrenceBetweenDates {

	public static void main(String[] args) throws ParseException {
		String d1="01-01-2001/01:01:01";
		String d2="07-07-2007/07:07:07";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
		Date startDate=format.parse(d1);
		Date endeDate=format.parse(d2);
		long diffInMilliSec=endeDate.getTime()-startDate.getTime();
		System.out.println(diffInMilliSec);
		
		long seconds=TimeUnit.MILLISECONDS.toSeconds(diffInMilliSec)%60;
		long minutes=TimeUnit.MILLISECONDS.toMinutes(diffInMilliSec)%60;
		long hours=TimeUnit.MILLISECONDS.toHours(diffInMilliSec)%24;
		long days=TimeUnit.MILLISECONDS.toDays(diffInMilliSec)%365;
		long years=TimeUnit.MILLISECONDS.toDays(diffInMilliSec)/365l;
		System.out.println(years+" years--- days"+days+" ----hours---"+hours+"---minutes---"+minutes+"---seconds-- "+seconds);
	
	}

}
