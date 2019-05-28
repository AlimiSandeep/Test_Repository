package com.cg.ui;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.cg.dao.DaoFactory;
import com.cg.dao.IEmpDao;
import com.cg.exceptions.IdException;
import com.cg.vo.Emp;
import com.cg.vo.Menu;
import com.cg.vo.SalComparator;

public class EmpUI {
	private static Scanner scan=new Scanner(System.in);
	private Comparator<Emp> sc=new SalComparator();
	private IEmpDao dao=DaoFactory.getDao();
	//or dao=new MemDaoImpl() can also be used instead of creating DaoFactory
	
	public void doAdd()
	{
	System.out.println("Enter the eid");
	int eid=scan.nextInt();
	System.out.println("enter the ename");
	String ename=scan.next();
	System.out.println("Enter the salary");
	double sal=scan.nextDouble();
	System.out.println("Enter the department");
	String dept=scan.next();
	
	Emp emp=new Emp(eid,ename,sal,dept);
	try{
	dao.addEmployee(emp);
	System.out.println("Row added");
	
	}catch(IdException e)
	{
		System.out.println(e.getMessage());
	}
	}
	
	public void viewById()
	{
		System.out.println("Enter the eid");
		int eid=scan.nextInt();
		try{
		Emp emp=dao.viewEmployee(eid);
		System.out.println(emp);
		}catch(IdException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void viewAll(){
		System.out.println("Enter the order:");
		String str=scan.next();
		Menu menu=Menu.valueOf(str.toUpperCase());
		List<Emp> list=dao.viewEmployee();
		switch(menu)
		{
		case BYID :list.sort(null);
		break;
		case BYSAL:list.sort(sc);
		break;
		// or list.sort(s1,s2)->{return ((Double)s1.getSal().compareTo(s2.getSal());
		}
		
		for(Emp emp:list)
		{
			System.out.println(emp);
		}
		//or list.stream().forEach(System.out::println);
	}
	
	public void editSalary()
	{
		System.out.println("Enter the eid");
		int eid=scan.nextInt();
		System.out.println("Enter the salary");
		double sal=scan.nextDouble();
		
		try
		{
			dao.editSalary(eid, sal);
			System.out.println("Salary edited");
		}
		catch(IdException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void remove()
	{
		System.out.println("Enter the eid");
		int eid=scan.nextInt();
		try
		{
			dao.removeEmployee(eid);
			System.out.println("Employee "+eid+" has been removed");
		
		}
		catch(IdException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
