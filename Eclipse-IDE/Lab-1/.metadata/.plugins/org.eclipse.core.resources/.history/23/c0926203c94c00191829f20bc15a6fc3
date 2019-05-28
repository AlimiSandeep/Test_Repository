package com.cg.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {
	public static void main(String[] args) {
		
		//Convert String into Date
		
		String str="12-05-2019";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-M-yyyy");
		LocalDate dt=LocalDate.parse(str,dtf);
		System.out.println(dt);
		
		//Parse date into String
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate dt1=LocalDate.now();
		System.out.println(dt1.format(dtf2));

		
	}

}
