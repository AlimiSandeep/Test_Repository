package com.capgemini.customerapp.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.dao.CustomerDaoImpl;
import com.capgemini.customerapp.dao.ICustomerDao;
import com.capgemini.customerapp.exceptions.NotFoundException;

public class TestViewCustomerByName {

	public static ICustomerDao dao;

	@BeforeAll
	public static void beforeAll() {
		dao = new CustomerDaoImpl();
	}

	@AfterAll
	public static  void afterAll() {
		dao = null;
	}
	
	@Test
	public void testViewCustByName1() throws NotFoundException {
		List<CustomerBean> lst = dao.viewCustomers("Rama");
		assertTrue(!lst.isEmpty());
	}
	
	@Test
	public void testViewCustByName2() throws NotFoundException {
		assertThrows(NotFoundException.class, ()->dao.viewCustomers("aaa"));
	}
	
	@Test
	public void testViewCustByName3() throws NotFoundException {
		List<CustomerBean> lst = dao.viewCustomers("Rama");
		assertTrue(lst.size() == 1);
	}
	
	@Test
	public void testViewCustByName4() throws NotFoundException {
		List<CustomerBean> lst = dao.viewCustomers();
		assertTrue(lst.size() == 2);
	}
}









