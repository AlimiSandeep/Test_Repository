package com.cg.axis.dao;

import java.util.ResourceBundle;

import com.cg.axis.vo.Account;

public class DaoFactory {
	private static AccountDao dao;
	private static ResourceBundle rb=ResourceBundle.getBundle("cg");
	static
	{
		
		try
		{
			Class cls=Class.forName(rb.getString("cname"));
			dao=(AccountDao)cls.newInstance();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static AccountDao getAccountDao()
	{
		return dao;
	}

	

}
