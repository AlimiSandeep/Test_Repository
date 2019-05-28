package com.cg.dates;

import java.sql.Date;
import java.time.LocalDate;

public class SqlDtDemo {
public static void main(String[] args) {
	
	//Convert local date into java.sql.Date
	
	LocalDate ldt=LocalDate.now();
	Date sqldt=Date.valueOf(ldt);
	System.out.println("SQL Date :"+sqldt);
	
	//Convert java.sql.Date into localdate
	
	LocalDate ldt2=sqldt.toLocalDate();
	System.out.println("Local date :"+ldt2);
}
}
