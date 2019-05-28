package com.cg.axis.ui;

import java.util.Scanner;

public class BankClient {
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
public static void processMenu(){
	BankUI uiobj=new BankUI();
	System.out.println("Enter the menu");
	String str=scan.next();
	Menu menu=Menu.valueOf(str);
	try
	{
	
		switch(menu)
		{
		case DEPOSIT:uiobj.doDeposit();
			break;
		case WITHDRAW:uiobj.doWithdrawl();
			break;
		case TRANSFER:uiobj.doTransfer();
			break;
		case GETBAL:uiobj.getAccount();
			break;
			
		}
	}
	catch(IllegalArgumentException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
