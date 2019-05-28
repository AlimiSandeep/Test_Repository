package com.cg.ui;

import java.util.Scanner;

public class EmpClient {
	
	private static Scanner scan = new Scanner(System.in);
	private static EmpUI uiobj = new EmpUI();

	public static void main(String[] args) {
		
		String str = null;
		String opt = null;
		do {
			processMenu();
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equalsIgnoreCase("y"));
	
	}
	private static void processMenu() {
		System.out.println("enter the options");
		String str = scan.next();
		try {
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch(menu) {
			case ADD:
				uiobj.doAdd();
				break;
			case VIEWBYID:
				uiobj.viewById();
				break;
			case VIEWALL:
				uiobj.viewAll();
				break;
			case EDIT:
				uiobj.edit();
				break;
			case REMOVE:
				uiobj.remove();
				}
		}catch(IllegalArgumentException ex) {
			System.out.println("invalid menu option");
		}
	}

}
