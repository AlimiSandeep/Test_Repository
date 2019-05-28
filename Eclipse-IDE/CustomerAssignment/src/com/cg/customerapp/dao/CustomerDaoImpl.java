package com.cg.customerapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cg.customerapp.util.CustomerStaticDB;
import com.cg.customerapp.vo.Customer;

/**
 * 
 * @author Sandeep
 * @version 1.0<br />
 *  CustomerDaoImpl does CRUD access using static map
 *
 */
public class CustomerDaoImpl implements ICustomerDao {

	private static Map<Integer, Customer> cmap = CustomerStaticDB.getCustomer();
	private static Map<String, String> lmap = CustomerStaticDB.getLocations();

	/**
	 * @param cust -Customer Instance
	 * @return boolean-return true if customer is added into map
	 */
	@Override
	public boolean addCustomer(Customer cust) {
		if (cmap.containsKey(cust.getId()))
			return false;
		cmap.put(cust.getId(), cust);
		return true;

	}

	/**
	 * @param id-int,pass customer id
	 * @return Customer-returns customer instance from map for the give id
	 */

	@Override
	public Customer viewCustomer(int id) {

		return cmap.get(id);
	}

	/**
	 * @param name-String,pass customer name
	 * @return list(Customer)-returns list of customers having that name
	 */
	@Override
	public List<Customer> viewCustomers(String name) {

		List<Customer> list = cmap.values().stream().filter(e -> e.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
		return list;
	}

	/**
	 * @return List-returns list of customers
	 */
	@Override
	public List<Customer> viewCustomers() {
		List<Customer> list = new ArrayList<>();
		list.addAll(cmap.values());
		return list;
	}



	/**
	 * @param if-int,pass Customer Id
	 * @return boolean-returns true if removed
	 */
	@Override
	public boolean removeCustomer(int id) {
		if (cmap.containsKey(id)) {
			cmap.remove(id);
			return true;
		}
		return false;
	}

	/**
	 * @param loc-String,pass the location
	 */
	@Override
	public String getLocation(String loc) {

		return lmap.get(loc);
	}

	
	/**
	 * @return keySet()-returns all the keys in the cmap
	 */
	@Override
	public Set<Integer> getIds() {
		return cmap.keySet();
	}

}
