package com.capgemini.customerapp.service;

import java.util.List;
import java.util.Random;
import java.util.Set;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.dao.CustomerDaoImpl;
import com.capgemini.customerapp.dao.ICustomerDao;
import com.capgemini.customerapp.exceptions.AgeException;
import com.capgemini.customerapp.exceptions.LocaleException;
import com.capgemini.customerapp.exceptions.NameException;
import com.capgemini.customerapp.exceptions.NotFoundException;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao dao = new CustomerDaoImpl();
	private Random rand = new Random();

	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
					 - Function Name	:	validateName(Customer)
					 - Input Parameters	:	name
					 - Return Type		:	boolean
					 - Throws		    :  	NameException
					 - Author	     	:	CAPGEMINI
					 - Creation Date	:	27/03/2019
					 - Description		:	validate name that matches the regex [A-Z][a-z]{2,} 
	********************************************************************************************************/
	@Override
	public boolean validateName(String name) throws NameException {
		if (!name.matches(nameExpr))
			throw new NameException();
		return true;
	}

	/*******************************************************************************************************
	 - Function Name	:	validateAge(int)
	 - Input Parameters	:	age
	 - Return Type		:	boolean
	 - Throws		    :  	AgeException
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	validate age between 20 and 60
   ********************************************************************************************************/

	@Override
	public boolean validateAge(int age) throws AgeException {
		if (age < 20 || age > 60)
			throw new AgeException();
		return true;
	}

	/*******************************************************************************************************
	 - Function Name	:	validateLocality(String)
	 - Input Parameters	:	location
	 - Return Type		:	boolean
	 - Throws		    :  	LocaleException
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	validate locality from static DB using dao.getLocation(location)
   ********************************************************************************************************/

	@Override
	public boolean validateLocality(String location) throws LocaleException {
		String loc = dao.getLocation(location);
		if (loc == null)
			throw new LocaleException();
		return true;
	}

	/*******************************************************************************************************
	 - Function Name	:	addCustomer(CustomerBean)
	 - Input Parameters	:	cust
	 - Return Type		:	boolean
	 - Throws		    :  	
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	add customer using dao.addCustomer(cust)
  ********************************************************************************************************/
	@Override
	public boolean addCustomer(CustomerBean cust) {

		return dao.addCustomer(cust);
	}

	/*******************************************************************************************************
	 - Function Name	:	viewCustomer(int)
	 - Input Parameters	:	id
	 - Return Type		:	CustomerBean
	 - Throws		    :  	NotFoundException
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	view customer by id using dao.viewCustomer(id)
 ********************************************************************************************************/
	@Override
	public CustomerBean viewCustomer(int id) throws NotFoundException {
		CustomerBean cust = dao.viewCustomer(id);
		return cust;
	}

	/*******************************************************************************************************
	 - Function Name	:	viewCustomers(String)
	 - Input Parameters	:	name
	 - Return Type		:	List
	 - Throws		    :  	NotFoundException
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	view customers by name using dao.viewCustomers(name)
 ********************************************************************************************************/
	@Override
	public List<CustomerBean> viewCustomers(String name) throws NotFoundException {
		List<CustomerBean> customers = dao.viewCustomers(name);
		return customers;
	}

	/*******************************************************************************************************
	 - Function Name	:	viewCustomers() 
	 - Input Parameters	:	
	 - Return Type		:	List
	 - Throws		    :  	NotFoundException
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	returns all customers using dao.viewCustomers()
 ********************************************************************************************************/
	@Override
	public List<CustomerBean> viewCustomers() throws NotFoundException {
				
		return dao.viewCustomers();
	}
	/*******************************************************************************************************
	 - Function Name	:	removeCustomer(int)
	 - Input Parameters	:	id
	 - Return Type		:	boolean
	 - Throws		    :  	NotFoundException
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	removing the customer using dao.removeCustomer(id)
 ********************************************************************************************************/
	@Override
	public boolean removeCustomer(int id) throws NotFoundException {
			
		return dao.removeCustomer(id);
	}

	/*******************************************************************************************************
	 - Function Name	:	generateID()
	 - Input Parameters	:	
	 - Return Type		:	int
	 - Throws		    :  	
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	retuurns a random unique customer ID
 ********************************************************************************************************/
	@Override
	public int generateID() {
		boolean res = true;
		int id = 0;
		Set<Integer> ids = dao.getIds();
		do {
			id = rand.nextInt(100) + 1;
			if (!ids.contains(id))
				res = false;
		} while (res);
		return id;
	}

	/*******************************************************************************************************
	 - Function Name	:	getLocalityName(String)
	 - Input Parameters	:	locidx
	 - Return Type		:	String
	 - Throws		    :  	
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	get location name using dao.getLocation(locidx)
 ********************************************************************************************************/
	public String getLocalityName(String locidx) {
		return dao.getLocation(locidx);
	}

}
