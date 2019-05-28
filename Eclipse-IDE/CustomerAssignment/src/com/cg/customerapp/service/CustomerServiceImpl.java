package com.cg.customerapp.service;

import java.util.List;
import java.util.Random;
import java.util.Set;

import com.cg.customerapp.dao.CustomerDaoImpl;
import com.cg.customerapp.dao.ICustomerDao;
import com.cg.customerapp.exceptions.AgeException;
import com.cg.customerapp.exceptions.LocalityException;
import com.cg.customerapp.exceptions.NameException;
import com.cg.customerapp.exceptions.NotFoundException;
import com.cg.customerapp.vo.Customer;

public class CustomerServiceImpl implements ICustomerService {

	private static ICustomerDao dao=new CustomerDaoImpl();
	private Random rand=new Random();
	
	/**
	 * @param name-String,pass customer name
	 * @return boolean-return strue, if validation matches [A-Z][a-zA-Z]{2,}
	 * @throws NameException-raises if validation fails
	 */
	@Override
	public boolean validateName(String name) throws NameException {
		if(!name.matches("[A-Z][a-zA-Z]{2,}"))
		throw new NameException();
		
		return true;
	}

	
	/**
	 * @param age-int,pass age
	 * @return boolean-returns true if age is between 20 and 60
	 * @throws AgeException -raises if age validation fails
	 */
	@Override
	public boolean validateAge(int age) throws AgeException {
		if(age<20 || age>60)
			throw new AgeException();

		return true;
	}

	@Override
	public String validateLocality(String str) throws LocalityException {
		String loc=dao.getLocation(str);
		if(loc==null)
			throw new LocalityException();
		return loc;
	}

	@Override
	public boolean addCustomer(Customer cust) {
		boolean res=dao.addCustomer(cust);
		if(!res)
			return false;
		return true;
	}

	@Override
	public Customer viewCustomer(int id) throws NotFoundException {
		Customer obj=dao.viewCustomer(id);
		if(obj==null)
			throw new NotFoundException();
		
		return obj;
	}

	@Override
	public List<Customer> viewCustomers(String name) throws NotFoundException {
		List<Customer> list=dao.viewCustomers(name);
		if(list.isEmpty())
			throw new NotFoundException();
		return list ;
	}

	@Override
	public List<Customer> viewCustomers() throws NotFoundException {
		List<Customer> list=dao.viewCustomers();
		if(list.isEmpty())
			throw new NotFoundException();
		return list ;
	}

	@Override
	public boolean removeCustomer(int id) throws NotFoundException {
		boolean res=dao.removeCustomer(id);
		if(!res)
			throw new NotFoundException();
		
		return res;
	}

	@Override
	public int generateID() {
	
		boolean res=true;
		int id=0;
		Set<Integer> set=dao.getIds();
		do {
		id=rand.nextInt(100)+1;
		if(!set.contains(id))
			res=false;
		}while(res);
	
		return id;
	}


	@Override
	public String getLocalityName(String locidx) {
		return dao.getLocation(locidx);
	}

}
