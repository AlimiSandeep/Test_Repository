package com.cg.service;

import java.util.ResourceBundle;

public class DaoFactory {
	public static IDao getInstance()
	{
		IDao dao=null;
		ResourceBundle rb=ResourceBundle.getBundle("cg");	//load the cg.properties
		String str=rb.getString("cname");	//get the value for cname property
		try{
		Class cls=Class.forName(str);	 //load the given classs programatically into memory
		dao=(IDao)cls.newInstance();	//creating the instance
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return dao;
	}

}
