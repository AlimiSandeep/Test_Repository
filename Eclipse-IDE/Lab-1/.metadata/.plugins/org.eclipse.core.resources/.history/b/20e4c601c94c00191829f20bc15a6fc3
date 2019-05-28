package com.cg.ui;

import java.util.Scanner;


public class EmployeeClient {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		String opt=null;
		do
		{
			processMenu();
			System.out.println("Press y to continue");
			opt=scan.next();
		}while(opt.equalsIgnoreCase("y"));
		
		
	}
	public static void processMenu()
	{
		EmpUi obj=new EmpUi();
		System.out.println("Enter the menu");
		String str=scan.next();
		Menu menu=Menu.valueOf(str);
		switch(menu)
		{
		case ADD:obj.addEmployee();break;
		case VIEW:obj.viewEmployee();break;
		case FINDSCHEME:obj.findInsuranceScheme();break;
		default:System.out.println("Invalid option....");break;
		}
		
		
		
	}
}
