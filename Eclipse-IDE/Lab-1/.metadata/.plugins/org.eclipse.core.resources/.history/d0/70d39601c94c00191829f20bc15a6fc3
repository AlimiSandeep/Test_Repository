package com.cg.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	private static IEmpDao dao;
	public static ResourceBundle rb = ResourceBundle.getBundle("cg");

	static {
		try {
			Class cls = Class.forName(rb.getString("cname"));
			dao = (IEmpDao) cls.newInstance();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static IEmpDao getDao() {
		return dao;
	}
}
