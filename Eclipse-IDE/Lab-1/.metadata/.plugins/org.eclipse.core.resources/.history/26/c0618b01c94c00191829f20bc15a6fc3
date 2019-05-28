package com.cg.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	
	private static IEmpDao dao;
	private static ResourceBundle rb=ResourceBundle.getBundle("cg");
	static
	{
		try
		{
			
			Class cls=Class.forName(rb.getString("cname"));
			dao=(IEmpDao)cls.newInstance();
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	
	
	public static IEmpDao getDao()
	{
		return dao;
	}

}
