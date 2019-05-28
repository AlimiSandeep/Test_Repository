package com.capgemini.customerapp.service;

import java.util.List;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.exceptions.AgeException;
import com.capgemini.customerapp.exceptions.LocaleException;
import com.capgemini.customerapp.exceptions.NameException;
import com.capgemini.customerapp.exceptions.NotFoundException;

public interface ICustomerService {

	boolean validateName(String name)throws NameException;
	boolean validateAge(int age)throws AgeException;
	boolean validateLocality(String str)throws LocaleException;
	boolean addCustomer(CustomerBean cust);
	CustomerBean viewCustomer(int id)throws NotFoundException;
	List<CustomerBean> viewCustomers(String name)throws NotFoundException;
	List<CustomerBean> viewCustomers()throws NotFoundException;
	boolean removeCustomer(int id)throws NotFoundException;
	int generateID();
	String getLocalityName(String locidx);
	String nameExpr = "[A-Z][a-z]{2,}";
}










