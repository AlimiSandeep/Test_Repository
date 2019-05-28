package com.capgemini.customerapp.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.dao.CustomerDaoImpl;
import com.capgemini.customerapp.dao.ICustomerDao;
import com.capgemini.customerapp.exceptions.NotFoundException;

@RunWith(JUnitPlatform.class)
public class TestDaoCrud {

public static ICustomerDao dao;
	
	@BeforeAll
	public static void beforeAll() {
		dao = new CustomerDaoImpl();
	}
	
	@AfterAll
	public static void afterAll() {
		dao = null;
	}
	
	@Test
	public void testAddCustomer1() {
		CustomerBean cust = new CustomerBean(3, "Bala", "mumbai", 23);
		assertTrue(dao.addCustomer(cust));
	}
	
	@Test
	public void testAddCustomer2() {
		CustomerBean cust = new CustomerBean(2, "Bala", "mumbai", 23);
		assertFalse(dao.addCustomer(cust));
	}
	
	@Test
	public void testAddCustomer3() throws NotFoundException {
		int size = dao.viewCustomers().size();
		CustomerBean cust = new CustomerBean(4, "Peter", "mumbai", 23);
		dao.addCustomer(cust);
		assertTrue(dao.viewCustomers().size() == size+1);
	}
	
	@Test
	public void testRemoveCustomer4() throws NotFoundException {
		
		assertTrue(dao.removeCustomer(1));
	}
	
	@Test
	public void testRemoveCustomer5() throws NotFoundException {
		
		assertThrows(NotFoundException.class, ()->dao.removeCustomer(102));
	}
}












