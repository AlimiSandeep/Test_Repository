package com.capgemini.customerapp.ui;

import java.util.Scanner;

import com.capgemini.customerapp.util.CustomerStaticDB;

public class CustomerClient {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		do {
			processMenu();
		} while (true);

	}

	private static void processMenu() {
		CustomerUI uiobj = new CustomerUI();
		System.out.println("enter the options\nAdd\nViewAll\nViewbyID\nView by name\nRemove\nEdit\nExit\n");
		String str = scan.next();
		try {
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch (menu) {
			case ADD:
				uiobj.doAdd();
				break;
			case VIEWBYID:
				uiobj.viewById();
				break;
			case VIEWALL:
				uiobj.viewAll();;
				break;
			case EDIT:
				uiobj.editCustomer();;
				break;
			case REMOVE:
				uiobj.removeById();
				break;
			case VIEWBYNAME:
				uiobj.viewByName();
				break;
			case EXIT:
				System.out.println("Application Exits");
				System.exit(0);
			}
		} catch (IllegalArgumentException ex) {
			System.err.println("invalid menu option");
		}
	}

}
