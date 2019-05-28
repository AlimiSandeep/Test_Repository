package com.cg.ui;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.cg.dao.DaoFactory;
import com.cg.dao.IEmpDao;
import com.cg.exceptions.IDExceptions;
import com.cg.vo.Emp;
import com.cg.vo.SalComparator;

public class EmpUI {
	private static Scanner scan = new Scanner(System.in);
	private Comparator sc = new SalComparator();
	private IEmpDao dao = DaoFactory.getDao();
//dao= new emp.MemDaoImpl();
	public void doAdd() {
		System.out.println("enter the eid");
		int eid = scan.nextInt();
		System.out.println("enter the ename");
		String ename = scan.next();
		System.out.println("enter the salary");
		double sal = scan.nextDouble();
		System.out.println("enter the dept");
		String dept = scan.next();
		Emp emp = new Emp(eid, ename, sal, dept);
		try {
			dao.addEmployee(emp);
			System.out.println("row added");
		} catch (IDExceptions e) {
			System.out.println(e.getMessage());
		}

	}
	public void viewById() {
		System.out.println("enter the eid");
		int eid = scan.nextInt();
		try {
			Emp emp = dao.viewEmployee(eid);
			System.out.println(emp);
		} catch (IDExceptions e) {
			
			System.out.println(e.getMessage());
		}
	}
	public void viewAll() {
		System.out.println("enter the order");
		String str = scan.next();
		Menu menu = Menu.valueOf(str.toUpperCase());
		List<Emp> lst = dao.viewEmployee();
		switch(menu) {
		case BYID:
			lst.sort(null);
			break;
		case BYSAL:
			lst.sort(sc);
			//lst.sort((s1,s2)->{return((Double)s1.getSal()).compareTo((Double)s2.getSal())});
			break;
		}
		
		
		for(Emp emp:lst) {
			System.out.println(emp);
		}
		//lst.stream().forEach(system.out::println());
	}
	
	public void edit() {
		System.out.println("enter the eid");
		int eid = scan.nextInt();
		System.out.println("enter the salary");
		double sal = scan.nextDouble();
		try {
			dao.editSalary(eid, sal);
			System.out.println("salary edited");
		} catch (IDExceptions e) {
			System.out.println(e.getMessage());
			}
		
	}
	public void remove() {
		System.out.println("enter the eid");
		int eid = scan.nextInt();
		try {
			dao.removeEmployee(eid);
			System.out.println("employee removed");
		} catch (IDExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
