package com.cg.flowcontrolAndExceptions;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName=scan.nextLine().trim();
		System.out.println("Enter the last name");
		String lastName=scan.nextLine().trim();
		try {
			validateName(firstName, "First name");
			validateName(lastName, "Second name");
			System.out.println(firstName+" "+lastName);
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
