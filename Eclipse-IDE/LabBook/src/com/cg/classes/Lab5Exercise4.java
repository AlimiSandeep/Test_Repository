package com.cg.classes;

import java.util.Scanner;

public class Lab5Exercise4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first name");
	String s1=scan.nextLine().trim();
	System.out.println("enter the second name");
	String s2=scan.nextLine().trim();
	try {
		validateName(s1, "first name");
		validateName(s2, "second name");
	} catch (NameException e) {
		System.out.println(e.getMessage());
	}
	
	
}

public static boolean validateName(String name, String field)throws NameException{
	if (name == null || name.isEmpty())
		throw new NameException(field + " cannot be blank");
	return true;
}
}
