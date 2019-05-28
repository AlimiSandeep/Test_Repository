package com.cg.customerapp.dao;

import java.util.List;
import java.util.Set;

import com.cg.customerapp.vo.Customer;

public interface ICustomerDao {
boolean addCustomer(Customer cust);
Customer viewCustomer(int id);
List<Customer> viewCustomers(String name);
List<Customer> viewCustomers();
boolean removeCustomer(int id);
String getLocation(String loc);
Set<Integer> getIds();
}
