package com.cg.flowcontrolAndExceptions;

import java.util.Scanner;

public class Exercise_6 {
public static void main(String[] args) {
	String empName;
	double salary;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your name:");
	empName=in.next();
	System.out.println("Enter salary :");
	salary=in.nextDouble();
	try
	{
		validateSalary(salary);
		System.out.println("Employee name="+empName+" \nSalary ="+salary);
	}catch(EmployeeException e)
	{
		System.out.println(e.getMessage());
	}
	
}
static boolean validateSalary(double sal) throws EmployeeException
{
	if(sal<3000)
		throw new EmployeeException("Salary cannot be less than 3000");
	return true;
}
}
