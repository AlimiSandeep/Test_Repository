package com.cg.client;

import java.util.Scanner;

import com.cg.util.BookException;
import com.cg.util.IdException;
import com.cg.util.NameException;

public class BookClient {
static Scanner scan=new Scanner(System.in);
public static void main(String[] args) throws IdException, BookException, NameException {
	String opt=null;
	do
	{
		processMenu();
		System.out.println("Press y to continue");
		opt=scan.next();
	}while(opt.equalsIgnoreCase("y"));
}
public static void processMenu() throws IdException, BookException, NameException
{
	BookClientUI obj=new BookClientUI();
	System.out.println("Enter the menu:\n\nADD\tEDIT\tVIEWBYID\tVIEWBYAUTHOR\tVIEWALL");
	String str=scan.next();
	Menu menu=Menu.valueOf(str.toUpperCase());
	switch(menu)
	{
	
	case ADD:obj.doAdd();break;
	case EDIT:obj.doEditBook();break;
	case VIEWBYAUTHOR:obj.doViewByAuthor();break;
	case VIEWBYID:obj.doViewById();break;
	case VIEWALL:obj.doViewAll();break;	
	default:System.out.println("Invalid Menu...!!");break;
	}
	
}
}
