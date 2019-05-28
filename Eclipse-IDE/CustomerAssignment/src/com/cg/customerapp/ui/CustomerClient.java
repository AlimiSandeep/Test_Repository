package com.cg.customerapp.ui;

import java.util.Scanner;

import com.cg.customerapp.exceptions.NotFoundException;
import com.cg.customerapp.ui.*;
public class CustomerClient {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws NotFoundException {
		
		do
		{
			processMenu();
		
		}while(true);
	}
	


public static void processMenu() throws NotFoundException 
{
	CustomerUI obj=new CustomerUI();
	System.out.println("Enter the menu:\n\nADD\tEDIT\tREMOVE\tVIEWBYID\tVIEWBYNAME\tVIEWALL\tEXIT");
	String str=scan.next();
	Menu menu=Menu.valueOf(str.toUpperCase());
	switch(menu)
	{
	
	case ADD:obj.doAdd();break;
	case REMOVE:obj.doRemoveCustomer();break;
	case EDIT:obj.editCustomer();break;
	case VIEWBYID:obj.doViewCustomerById();break;
	case VIEWBYNAME:obj.doViewCustomersByName();break;
	case VIEWALL:obj.doViewCustomersAll();break;	
	case EXIT:System.out.println("Application exits..");
		System.exit(0);
	default:System.out.println("Invalid Menu...!!");break;
	}
	
}

}
