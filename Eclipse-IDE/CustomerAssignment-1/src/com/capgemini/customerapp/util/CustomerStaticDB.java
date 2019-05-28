package com.capgemini.customerapp.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.customerapp.bean.CustomerBean;

public class CustomerStaticDB {

	private static Map<String, String> lmap = new HashMap<>();
	private static Map<Integer, CustomerBean> cmap = new HashMap<>();
	
	static {
		lmap.put("1", "mumbai");
		lmap.put("2", "pune");
		lmap.put("3", "hyderabad");
		
		cmap.put(1, new CustomerBean(1,"Rama", "mumbai", 23));
		cmap.put(2, new CustomerBean(2,"Jack", "pune", 22));
	}
	
	public static Map<String, String> getLocations(){
		return lmap;
	}
	
	public static Map<Integer, CustomerBean> getCustomer(){
		return cmap;
	}
}
