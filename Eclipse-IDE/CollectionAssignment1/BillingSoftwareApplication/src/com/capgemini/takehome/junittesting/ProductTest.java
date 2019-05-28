package com.capgemini.takehome.junittesting;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
import com.capgemini.takehome.util.IdException;

@RunWith(JUnitPlatform.class)
public class ProductTest {

	private static IProductService ser=new ProductService();
	private static IProductDAO dao=new ProductDAO();
	
	
	@Test
	public void test1()
	{
		assertThrows(IdException.class, ()->{ser.getProductDetails(1007);});
	}
	
	@Test
	public void test2()
	{
		assertEquals(new Product(1001, "iPhone"," Electronics", 35000),dao.getProductDetails(1001));
	
	}
}
