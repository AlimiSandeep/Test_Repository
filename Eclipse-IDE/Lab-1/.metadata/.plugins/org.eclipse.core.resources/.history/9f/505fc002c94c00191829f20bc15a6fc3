package com.cg.flowcontrolAndExceptions;

import java.util.Scanner;

public class Exercise_5 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter age: ");
	int age=in.nextInt();
	try
	{
		validateAge(age);
		System.out.println("Entered age is "+age);
	}
	catch(AgeException e)
	{
		System.out.println(e.getMessage());
	}
}
static  boolean validateAge(int age) throws AgeException
{
	if(age<=15)
		throw new AgeException("Invalid age....Age should be more than 15");
	return true;
}
}
