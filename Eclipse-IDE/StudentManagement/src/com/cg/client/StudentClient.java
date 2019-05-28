package com.cg.client;

import java.util.Scanner;

import com.cg.util.IdException;
import com.cg.util.MarksException;
import com.cg.util.NameException;
import com.cg.util.StudentException;

public class StudentClient {
private static Scanner scan=new Scanner(System.in);
public static void main(String[] args) throws NameException, IdException, MarksException, StudentException {
	String opt=null;
	do
	{
		processMenu();
		System.out.println("Press y to continue");
		opt=scan.next();
	}while(opt.equalsIgnoreCase("y"));
	
}
public static void processMenu() throws NameException, IdException, MarksException, StudentException
{
	
	StudentUI obj=new StudentUI();
	System.out.println("Enter the menu:\n\nADD\tEDIT\tREMOVE\tVIEWBYID\tVIEWALL");

	String str=scan.next();
	Menu menu=Menu.valueOf(str.toUpperCase());
	switch(menu)
	{
	
	case ADD:obj.doAddStudent();;break;
	case EDIT:obj.doEditStudent();break;
	case REMOVE:obj.doRemoveStudent();break;
	case VIEWBYID:obj.doViewStudentById();;break;
	case VIEWALL:obj.doViewAll();;break;	
	default:System.out.println("Invalid Menu...!!");break;
	}
	
}
}
