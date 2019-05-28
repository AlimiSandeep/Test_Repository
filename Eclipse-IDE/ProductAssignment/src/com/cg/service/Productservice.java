package com.cg.service;

import java.util.List;

import com.cg.util.NameException;
import com.cg.util.ProductException;
import com.cg.vo.Product;

public interface Productservice {
	boolean validateProductName(String name) throws NameException;
	boolean addProduct(Product prod) throws ProductException ;
	Product viewProductById(int pid) throws ProductException;
	List<Product> displayAll() ;
	
}
