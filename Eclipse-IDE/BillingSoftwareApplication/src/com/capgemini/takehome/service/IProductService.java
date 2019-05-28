package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.IdException;
import com.capgemini.takehome.util.ProductCodeException;
import com.capgemini.takehome.util.QuantityException;

public interface IProductService {
	Product getProductDetails(int productCode) throws IdException;
	boolean productValidation(int productCode) throws ProductCodeException;
	boolean quantityValidation(int quantity) throws QuantityException;
	
}
