package com.capgemini.customerapp.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.dao.CustomerDaoImpl;
import com.capgemini.customerapp.dao.ICustomerDao;
import com.capgemini.customerapp.exceptions.NotFoundException;

public class TestViewCustomer {

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
	public void testViewCustomer1() throws NotFoundException {
		assertNotNull(dao.viewCustomer(2));
	}
	
	@Test
	public void testViewCustomer2() throws NotFoundException {
		CustomerBean cust = new CustomerBean(2,"Jack", "pune", 22);
		CustomerBean actual = dao.viewCustomer(2);
		assertEquals(cust.toString(), actual.toString());
	}
	
	@Test
	public void testViewCustomer3() throws NotFoundException {
		assertThrows(NotFoundException.class, ()->dao.viewCustomer(102));
	}
	
}









