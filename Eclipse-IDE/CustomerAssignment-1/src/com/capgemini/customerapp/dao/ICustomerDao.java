package com.capgemini.customerapp.dao;

import java.util.List;
import java.util.Set;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.exceptions.NotFoundException;

public interface ICustomerDao {

	boolean addCustomer(CustomerBean cust);
	CustomerBean viewCustomer(int id)throws NotFoundException;
	List<CustomerBean> viewCustomers(String name)throws NotFoundException;
	List<CustomerBean> viewCustomers()throws NotFoundException;
	boolean removeCustomer(int id)throws NotFoundException;
	String getLocation(String loc);
	Set<Integer> getIds();
}
