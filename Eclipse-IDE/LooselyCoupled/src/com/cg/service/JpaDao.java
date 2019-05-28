package com.cg.service;

public class JpaDao implements IDao {
	public JpaDao() {
		System.out.println("JPA Demo construtor");}
	@Override
	public void getEmployee() {
		System.out.println("Jpa Dao - Employee");		
	}
	public void m() {
		System.out.println("M() method");
	}

}
