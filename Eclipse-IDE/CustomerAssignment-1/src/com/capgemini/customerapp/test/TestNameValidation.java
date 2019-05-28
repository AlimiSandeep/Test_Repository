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
import com.capgemini.customerapp.exceptions.NameException;
import com.capgemini.customerapp.exceptions.NotFoundException;
import com.capgemini.customerapp.service.CustomerServiceImpl;
import com.capgemini.customerapp.service.ICustomerService;
@RunWith(JUnitPlatform.class)
public class TestNameValidation {

	private static ICustomerService ser ;
	
	@BeforeAll
	public static void beforeAll() {
		ser = new CustomerServiceImpl();
	}
	
	@AfterAll
	public static void afterAll() {
		ser = null;
	}
	
	@Test
	public void testNameValidation1() throws NameException {
		assertTrue(ser.validateName("Rama"));
	}
	
	@Test
	public void testNameValidation2() throws NameException {
		assertThrows(NameException.class, ()->ser.validateName("aa"));
	}
}









