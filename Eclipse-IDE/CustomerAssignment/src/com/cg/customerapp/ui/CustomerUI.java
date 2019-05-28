package com.cg.customerapp.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cg.customerapp.exceptions.AgeException;
import com.cg.customerapp.exceptions.LocalityException;
import com.cg.customerapp.exceptions.NameException;
import com.cg.customerapp.exceptions.NotFoundException;
import com.cg.customerapp.service.CustomerServiceImpl;
import com.cg.customerapp.service.ICustomerService;
import com.cg.customerapp.util.CustomerStaticDB;
import com.cg.customerapp.vo.Customer;

public class CustomerUI {
private static ICustomerService ser=new CustomerServiceImpl();
private Scanner scan=CustomerStaticDB.scan;

public void doAdd()
{
	
	System.out.println("Enter name:");
	String name=scan.next();
	try {
		ser.validateName(name);
		System.out.println("Enter age");
		int age=scan.nextInt();
		ser.validateAge(age);
		System.out.println("Enter \n1-Mumbai\n2-Pune\n3-Hyderabad");
		String loc=scan.next();
		ser.validateLocality(loc);
		int id=ser.generateID();
		Customer cust=new Customer(id,name,ser.getLocalityName(loc),age);
		if(ser.addCustomer(cust))
			System.out.println("Successfully added Customer...");
		else
			System.out.println("Customer not added");
		
	} catch (NameException | AgeException | InputMismatchException | LocalityException e) {
		System.err.println(e);
	}

}

public void doViewCustomerById()
{
	System.out.println("Enter id:");
	int id=scan.nextInt();
	try {
		Customer cust=ser.viewCustomer(id);
		System.out.println(cust);
	} catch (NotFoundException |InputMismatchException e) {
		System.err.println(e);
	}
}
public void doViewCustomersByName() throws NotFoundException
{
	System.out.println("Enter the customer name:");
	String name=scan.next();
	List<Customer> list=ser.viewCustomers(name);
	list.stream().forEach(System.out::println);
}
public void doViewCustomersAll() throws NotFoundException
{
	
	List<Customer> list=ser.viewCustomers();
	list.stream().forEach(System.out::println);
	
}
public void doRemoveCustomer() throws NotFoundException
{
	System.out.println("Enter the customerid to remove:");
	int id=scan.nextInt();
	if(ser.removeCustomer(id))
	System.out.println("Succesfulle removed");

}
public void editCustomer()
{
	try
	{
		System.out.println("Enter the ID to edit:");
		int id=scan.nextInt();
		Customer cust=ser.viewCustomer(id);
		editName(cust);
		editAge(cust);
		editLocality(cust);
	}
	catch( InputMismatchException e)
	{
		System.err.println("Value must be numeric");
	} catch (NotFoundException e) {
		System.err.println(e);
	}
}

private void editName(Customer cust)
{
	String name=null;
	try
	{
	System.out.println("Enter y to edit the name");
	String opt=scan.next();
	if(opt.equalsIgnoreCase("y"))
	{
		System.out.println("Enter the name");
		name=scan.next();
		ser.validateName(name);
		cust.setName(name);
	}
	}
	catch(NameException e)
	{
		System.err.println(e);
	}
	
}

private void editAge(Customer cust)
{
	try {
	System.out.println("Enter y to edit the age");
	String opt=scan.next();
	if(opt.equalsIgnoreCase("y"))
	{
	
	System.out.println("Enter the age");
	int age=scan.nextInt();
	ser.validateAge(age);
	cust.setAge(age);
	
	}
	}
	catch(InputMismatchException | AgeException e)
	{
		System.err.println(e);
	}
	
}
private void editLocality(Customer cust)
{
	try {
	System.out.println("Enter y to edit the locality");
	String opt=scan.next();
	if(opt.equalsIgnoreCase("y"))
	{
	
	System.out.println("Enter the locality");
	String loc=scan.next();
	ser.validateLocality(loc);
	cust.setLocality(ser.getLocalityName(loc));
	
	}
	}
	catch(InputMismatchException  e)
	{
		System.err.println("Value must be string");
	} catch (LocalityException e) {
		System.err.println(e);
	}
	
}
}
