package com.capgemini.customerapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.capgemini.customerapp.bean.CustomerBean;
import com.capgemini.customerapp.exceptions.NotFoundException;
import com.capgemini.customerapp.util.CustomerStaticDB;

/**
 * 
 * @author Govind
 * @version 1.0<br/>
 *          CustomerDaoImpl does CRUD access using static map
 *
 */
public class CustomerDaoImpl implements ICustomerDao {
	
	private Map<Integer, CustomerBean> cmap = CustomerStaticDB.getCustomer();
	private Map<String, String> locmap = CustomerStaticDB.getLocations();
	 
	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
				 - Function Name	:	addCustomer(Customer)
				 - Input Parameters	:	cust
				 - Return Type		:	boolean
				 - Throws		    :  	NotFoundException
				 - Author	     	:	CAPGEMINI
				 - Creation Date	:	27/03/2019
				 - Description		:	adding a customer
	********************************************************************************************************/
	@Override
	public boolean addCustomer(CustomerBean cust) {
		if(cmap.containsKey(cust.getId())) {
			return false;
		}
		cmap.put(cust.getId(), cust);
		return true;
	}

	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
				 - Function Name	:	viewCustomers(int)
				 - Input Parameters	:	id
				 - Return Type		:	CustomerBean
				 - Throws		    :  	NotFoundException
				 - Author	     	:	CAPGEMINI
				 - Creation Date	:	27/03/2019
				 - Description		:	View the customer for the given ID
	********************************************************************************************************/
	@Override
	public CustomerBean viewCustomer(int id) throws NotFoundException {
		if(!cmap.containsKey(id))
			throw new NotFoundException();
		return cmap.get(id);
	}

	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
				 - Function Name	:	viewCustomers(String)
				 - Input Parameters	:	name
				 - Return Type		:	List
				 - Throws		    :  	NotFoundException
				 - Author	     	:	CAPGEMINI
				 - Creation Date	:	27/03/2019
				 - Description		:	View all customers for the given name
	********************************************************************************************************/
	@Override
	public List<CustomerBean> viewCustomers(String name) throws NotFoundException {
		List<CustomerBean> lst = cmap.values().stream()
				.filter(e->e.getName().equalsIgnoreCase(name))
		        .collect(Collectors.toList());
		if(lst.isEmpty())
			throw new NotFoundException();
		return lst;
	}

	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
			 - Function Name	:	viewCustomers()
			 - Input Parameters	:	
			 - Return Type		:	List
			 - Throws		    :  	NotFoundException
			 - Author	     	:	CAPGEMINI
			 - Creation Date	:	27/03/2019
			 - Description		:	View all customers
	********************************************************************************************************/
	@Override
	public List<CustomerBean> viewCustomers()throws NotFoundException {
		List<CustomerBean> lst = new ArrayList<>(cmap.values());
		if(lst.isEmpty())
			throw new NotFoundException();
		return lst;
	}

	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
		 - Function Name	:	removeCustomer(int id)
		 - Input Parameters	:	id
		 - Return Type		:	boolean
		 - Throws		    :  	NotFoundException
		 - Author	     	:	CAPGEMINI
		 - Creation Date	:	27/03/2019
		 - Description		:	remove customer for the given ID
	********************************************************************************************************/
	@Override
	public boolean removeCustomer(int id) throws NotFoundException {
		if(!cmap.containsKey(id))
			throw new NotFoundException();
		cmap.remove(id);
		return true;
	}
	
	
	//------------------------ 1.Customer Application --------------------------
	/*******************************************************************************************************
				 - Function Name	:	getLocation(String)
				 - Input Parameters	:	loc
				 - Return Type		:	String
				 - Throws		    :  	NotFoundException
				 - Author	     	:	CAPGEMINI
				 - Creation Date	:	27/03/2019
				 - Description		:	get location name for the given location idx
	********************************************************************************************************/
	@Override
	public String getLocation(String loc) {
		return locmap.get(loc);
	}
	/*******************************************************************************************************
	 - Function Name	:	getIds()
	 - Input Parameters	:	
	 - Return Type		:	Set
	 - Throws		    :  
	 - Author	     	:	CAPGEMINI
	 - Creation Date	:	27/03/2019
	 - Description		:	get all IDs in a set
   ********************************************************************************************************/	
	@Override
	public Set<Integer> getIds() {
		
		return cmap.keySet();
	}

}







