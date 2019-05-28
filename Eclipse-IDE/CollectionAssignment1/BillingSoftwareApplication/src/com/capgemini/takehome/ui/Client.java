package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.util.IdException;
import com.capgemini.takehome.util.ProductCodeException;
import com.capgemini.takehome.util.QuantityException;


public class Client {
static Scanner scan=new Scanner(System.in);

public static void main(String[] args) throws ProductCodeException, QuantityException, IdException {

	do
	{
		processMenu();
		
	}while(true);
}
public static void processMenu() throws ProductCodeException, QuantityException, IdException
{
	
	ProductUI obj=new ProductUI();
	System.out.println("-------------------------------------");
	System.out.println("Enter menu \nGenerate Bill\tExit");
	String str=scan.next();
	Menu menu=Menu.valueOf(str.toUpperCase());
	switch(menu)
	{
	case BILL:obj.view();break;
	case EXIT:System.exit(0);break;
	default:System.out.println("Invalid option..");break;
	}
	
}
}
