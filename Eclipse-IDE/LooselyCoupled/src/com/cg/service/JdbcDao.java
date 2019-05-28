package com.cg.service;

public class JdbcDao implements IDao {
	JdbcDao() {
		System.out.println("JDBC Dao Constructor");
	}

	public void getEmployee() {
		System.out.println("JDBC - Employee");		
	}
	
	public void clearPdc() {
		System.out.println("Clear Pdc");
	}

}
