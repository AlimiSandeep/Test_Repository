package com.cg.axis.vo;

public class Account {
	private int accId;
	private String custName;
	private double balance;
	public Account(int accId, String custName, double balance) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	
	public String getCustName() {
		return custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return accId + " " + custName + " "+ balance ;
	}
	

}
