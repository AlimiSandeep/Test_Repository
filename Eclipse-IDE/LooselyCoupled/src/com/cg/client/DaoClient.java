package com.cg.client;

import com.cg.service.DaoFactory;
import com.cg.service.IDao;
import com.cg.service.JdbcDao;

public class DaoClient {
	public static void main(String[] args) {
		IDao dao=DaoFactory.getInstance();
		dao.getEmployee();
	}

}
