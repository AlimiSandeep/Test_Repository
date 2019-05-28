package com.cg.service;

import java.util.List;

import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.util.NameException;
import com.cg.util.ProductException;
import com.cg.vo.Product;

/**
 * 
 * @author Sandeep
 * @version 1.0
 * ProductServiceImpl provides services for product such as add,view,and validating name
 *
 */



public class ProductServiceImpl implements Productservice{

	ProductDao dao=new ProductDaoImpl();
	
	
	
	/**
	 * @param str String
	 * return boolean
	 * returns true if string matches only alphabets and contains atleast 3 alphabets
	 */

	@Override
	public boolean validateProductName(String name) throws NameException {
		
		if(!name.matches("[a-zA-Z]{3,}"))
			throw new NameException("Name cannot be less than 3 characters");
			
		return true;
	}
	
	
	/**
	 * @param str String
	 * return boolean
	 * @throws ProductException raised if product is not added
	 * it uses dao method for adding the product
	 */

	@Override
	public boolean addProduct(Product prod) throws ProductException {
		boolean res=dao.addProduct(prod);
		if(!res)
		throw new ProductException("Product Id already exists");
		return true;
	}
	
	/**
	 * @param pid value of Product Id
	 * @return Product
	 * @throws ProductException raised if product is not available
	 */

	@Override
	public Product viewProductById(int pid) throws ProductException {
		Product obj=dao.viewProductById(pid);
		if(obj==null)
			throw new ProductException("Id Doesnt exists");
		return obj;
	}

	
	/**
	 * @return List<Product>
	 * It uses dao method and returns List<Product>
	 */
	@Override
	public List<Product> displayAll() {
		List<Product> list=dao.displayAll();
		return list;
	}
	
}
