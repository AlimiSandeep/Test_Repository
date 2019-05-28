package com.cg.service;

public class Bank implements Atm,Online,Agent {
	private static Bank bank=new Bank();

	@Override
	public void clearPdc() {
		System.out.println("Clear PDC");		
	}
	private Bank() {
	}
	public static Atm getAtm()
	{
		Atm atm=bank;
		return atm;
	}
	public static Online getOnline()
	{
		Online online=bank;
		return online;
	}
	public static Agent getAgent()
	{
		Agent agent=bank;
		return agent;
	}
	
	@Override
	public void transferFund() {
		System.out.println("Transfer fund");		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");		
	}

}
