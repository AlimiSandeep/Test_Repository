package com.cg.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.service.EmpServiceimpl;
import com.cg.vo.Employee;

public class EmpUi {
	static Scanner scan=new Scanner(System.in);
	EmpServiceimpl esi=new EmpServiceimpl();
	void addEmployee()
	{
		System.out.println("Enter the employee id:");
		int id=scan.nextInt();
		System.out.println("Enter the employee name:");
		String name=scan.next();
		System.out.println("enter the salary:");
		double sal=scan.nextDouble();
		Employee emp=new Employee(id,name,sal);
		int res = esi.addEmployee(emp);
		if(res==1)
			System.out.println("Employee added successfully");
		else
			System.out.println("Already exists");
			
	}
	void viewEmployee()
	{
		
		List<Employee> list=esi.viewEmp();
		list.stream().forEach(System.out::println);
	}
	void findInsuranceScheme()
	{
		System.out.println("Enter the employee id:");
		int id=scan.nextInt();
		Employee emp=esi.findInsuranceScheme(id);
		//System.out.println(emp);
		if(emp==null)
			System.out.println("Not available");
		else
			System.out.println(emp);
		
	}

}
