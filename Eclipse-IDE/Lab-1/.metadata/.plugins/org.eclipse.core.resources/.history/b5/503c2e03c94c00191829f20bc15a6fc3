package com.cg.client;

import java.util.List;
import java.util.Scanner;

import com.cg.service.ProductServiceImpl;
import com.cg.service.Productservice;
import com.cg.util.NameException;
import com.cg.util.ProductException;
import com.cg.vo.Product;

public class ProductUI {
	static Scanner scan=new Scanner(System.in);
	Productservice ser=new ProductServiceImpl();
	
	public void doAddProduct()
	{
		System.out.println("Enter product id:");
		int pid=scan.nextInt();
		System.out.println("Enter product name:");
		String prodName=scan.next();
		System.out.println("Enter product price:");
		double price=scan.nextDouble();
		
		try
		{
			if(ser.validateProductName(prodName)){
			Product obj=new Product(pid,prodName,price);
			ser.addProduct(obj);
			System.out.println("Successfully added");
		}
		}catch(NameException | ProductException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void doDisplayById() throws ProductException
	{
		System.out.println("Enter the product id:");
		int pid=scan.nextInt();
		 Product prod=ser.viewProductById(pid);
		 System.out.println(prod);
			
	}
	
	public void doDisplayAll()
	{
		List<Product> list=ser.displayAll();
		list.stream().forEach(System.out::println);
	}
}
