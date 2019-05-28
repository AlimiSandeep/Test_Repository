package com.capgemini.customerapp.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.exceptions.AgeException;
import com.capgemini.customerapp.exceptions.LocaleException;
import com.capgemini.customerapp.exceptions.NameException;
import com.capgemini.customerapp.exceptions.NotFoundException;
import com.capgemini.customerapp.service.CustomerServiceImpl;
import com.capgemini.customerapp.service.ICustomerService;
import com.capgemini.customerapp.util.CustomerStaticDB;

public class CustomerUI {
	private ICustomerService ser = new CustomerServiceImpl();
	private Scanner scan = CustomerClient.scan;

	/**
	 * This method get the name, age and locality from the user and validates and
	 * added to DB by invoking respective service method
	 */
	public void doAdd() {

			CustomerBean cust = new CustomerBean();
			addName(cust);
			addAge(cust);
			addLocality(cust);
			cust.setId(ser.generateID());
			boolean res = ser.addCustomer(cust);
			if (res)
				System.out.println("Customer added");
			else
				System.out.println("Customer not added");

	

	}

	private void addName(CustomerBean cust) {
		String name = null;
		boolean res = false;
		do {
			try {
				System.out.println("enter the name");
				name = scan.next();
				res = ser.validateName(name);
				cust.setName(name);

			} catch (NameException e) {
				System.err.println(e);
				
			}
		} while (!res);
	}

	private void addAge(CustomerBean cust) {
		int age = 0;
		boolean res = false;
		do {
			try {
				System.out.println("enter the age");
				age = scan.nextInt();
				res = ser.validateAge(age);
				cust.setAge(age);

			} catch (AgeException e) {
				System.err.println(e);
				
			}
		} while (!res);
	}

	private void addLocality(CustomerBean cust) {
		String loc = null;
		boolean res = false;
		do {
			try {

				System.out.println("1-mumbai\n2-pune\n3-hyderabad");
				loc = scan.next();
				res = ser.validateLocality(loc);
				cust.setLocality(ser.getLocalityName(loc));

			} catch (LocaleException e) {
				System.err.println(e);
				
			}
		} while (!res);
	}

	/**
	 * This method get the ID from the user and displays customer
	 */
	public void viewById() {
		try {
			System.out.println("enter the id to search");
			int id = scan.nextInt();
			CustomerBean cust = ser.viewCustomer(id);
			System.out.println(cust);
		} catch (NotFoundException e) {
			System.err.println(e);
		} catch (InputMismatchException e) {
			System.err.println("value must be numeric");
		}
	}

	/**
	 * This method get the Id from user and removes the respective customer
	 */
	public void removeById() {
		try {
			System.out.println("enter the id to remove");
			int id = scan.nextInt();
			ser.removeCustomer(id);
			System.out.println("customer removed");
		} catch (NotFoundException e) {
			System.err.println(e);
		} catch (InputMismatchException e) {
			System.err.println("value must be numeric");
		}
	}

	public void viewAll() {
		try {
			ser.viewCustomers().stream().forEach(System.out::println);

		} catch (NotFoundException e) {
			System.err.println(e);
		}
	}

	public void viewByName() {
		try {
			System.out.println("enter the name");
			String name = scan.next();
			ser.viewCustomers(name).stream().forEach(System.out::println);

		} catch (NotFoundException e) {
			System.err.println(e);
		}
	}

	public void editCustomer() {
		try {
			System.out.println("enter the ID to edit");
			int id = scan.nextInt();
			CustomerBean cust = ser.viewCustomer(id);
			editName(cust);
			editAge(cust);
			editLocality(cust);
		} catch (InputMismatchException e) {
			System.err.println("value must be numeric");
		} catch (NotFoundException e) {
			System.err.println(e);
		}
	}

	private void editName(CustomerBean cust) {
		String name = null;
		boolean res = false;
		do {
			try {
				System.out.println("press y to edit the name");
				String opt = scan.next();
				if (opt.equalsIgnoreCase("y")) {
					System.out.println("enter the name");
					name = scan.next();
					res = ser.validateName(name);
					cust.setName(name);
				}else {
					res = true;
				}
			} catch (NameException e) {
				System.err.println(e);
				
			}
		} while (!res);
	}

	private void editAge(CustomerBean cust) {
		boolean res = false;
		do {
			try {
				System.out.println("press y to edit the age");
				String opt = scan.next();
				if (opt.equalsIgnoreCase("y")) {
					System.out.println("enter the age");
					int age = scan.nextInt();
					res = ser.validateAge(age);
					cust.setAge(age);
				}else {
					res = true;
				}

			} catch (InputMismatchException e) {
				System.err.println("value must be numeric");
				
			} catch (AgeException e) {
				System.err.println(e);
				
			}
		} while (!res);
	}

	private void editLocality(CustomerBean cust) {
		String loc = null;
		boolean res = false;
		do {
			try {
				System.out.println("press y to edit the locality");
				String opt = scan.next();
				if (opt.equalsIgnoreCase("y")) {
					System.out.println("1-mumbai\n2-pune\n3-hyderabad");
					loc = scan.next();
					res = ser.validateLocality(loc);
					cust.setLocality(ser.getLocalityName(loc));
				}else {
					res = true;
				}
			} catch (LocaleException e) {
				System.err.println(e);
			}
		} while (!res);
	}
}
