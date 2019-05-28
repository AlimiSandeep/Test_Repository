package com.cg.customerapp.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.customerapp.vo.Customer;

public class CustomerStaticDB {
private static  Map<String,String> lmap=new HashMap<>();
private static  Map<Integer,Customer> cmap=new HashMap<>();
public static Scanner scan=new Scanner(System.in);

static
{
	lmap.put("1", "Mumbai");
	lmap.put("2", "Pune");
	lmap.put("3", "Hyderabad");
}

public static Map<String,String> getLocations()
{
	return lmap;
}

public static Map<Integer,Customer> getCustomer()
{
	return cmap;
}


}
