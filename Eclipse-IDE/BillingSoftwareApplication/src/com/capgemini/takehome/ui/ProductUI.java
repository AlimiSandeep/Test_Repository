package com.capgemini.takehome.ui;

import java.util.List;
import java.util.Scanner;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
import com.capgemini.takehome.util.IdException;
import com.capgemini.takehome.util.ProductCodeException;
import com.capgemini.takehome.util.QuantityException;

public class ProductUI {
private static IProductService ser=new ProductService();
private static Scanner scan=new Scanner(System.in);
public void view() throws  ProductCodeException, QuantityException, IdException
{
	System.out.println("Enter the productCode:");
	int productCode=scan.nextInt();
	ser.productValidation(productCode);
	Product product=ser.getProductDetails(productCode);
	System.out.println("Enter the num of quantity:");
	int quantity=scan.nextInt();
	ser.quantityValidation(quantity);
	
	
	double finalPrice=product.getPrice()*quantity;
	System.out.println("Product Name 		:"+product.getProdName());
	System.out.println("Product Category	:"+product.getProdCategory());
	System.out.println("Product price		:"+product.getPrice());
	System.out.println("Quantity 		:"+quantity);
	System.out.println("Line Total(Rs) 		:"+finalPrice);
	
}
}
