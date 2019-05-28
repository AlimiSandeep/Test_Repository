package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.util.IdException;
import com.capgemini.takehome.util.ProductCodeException;
import com.capgemini.takehome.util.QuantityException;

public class ProductService implements IProductService {
private static IProductDAO dao=new ProductDAO();

@Override
public Product getProductDetails(int productCode) throws IdException {
	Product obj=dao.getProductDetails(productCode);
	if(obj==null)
		throw new IdException("Sorry ! The Product Code "+productCode+" is not available.");
	return obj;
}

@Override
public boolean productValidation(int productCode) throws ProductCodeException {
	if(productCode<1000 ||productCode>9999)
		throw new ProductCodeException();
	return true;
}

@Override
public boolean quantityValidation(int quantity) throws QuantityException {
	if(quantity<=0)
		throw new QuantityException();
	return true;
}



}
