package com.cg.customerapp.service;

import java.util.List;

import com.cg.customerapp.exceptions.AgeException;
import com.cg.customerapp.exceptions.LocalityException;
import com.cg.customerapp.exceptions.NameException;
import com.cg.customerapp.exceptions.NotFoundException;
import com.cg.customerapp.vo.Customer;

public interface ICustomerService {
boolean validateName(String name)throws NameException;
boolean validateAge(int age)throws AgeException;
String validateLocality(String str)throws LocalityException;

boolean addCustomer(Customer cust);
Customer viewCustomer(int id) throws NotFoundException;
List<Customer> viewCustomers(String name)throws NotFoundException;
List<Customer> viewCustomers()throws NotFoundException;
boolean removeCustomer(int id) throws NotFoundException;
int generateID();
String getLocalityName(String locidx);
}
