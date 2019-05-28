package com.cg.service;

public class NokiaLumia extends Nokia1100 {
	public int price=10000;
	public void browserNet()
	{
		//sendSMS();
		//doConverse();
		System.out.println("Browse Net");
	}

	@Override               
	public void doConverse() {
	System.out.println("Converse 4G");
	}

	public void do2gConverse()
	{
		super.doConverse();
	}
}
