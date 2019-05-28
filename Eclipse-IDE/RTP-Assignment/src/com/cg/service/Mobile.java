package com.cg.service;

import com.cg.Util.Constants;

public class Mobile extends Flipkart {
	private int pId;
	private String pName;
	private int price;
	public Mobile(int pId, String pName, int price) {
		super(pId, pName, price);
	}
	public String isExpensive() { 
		if(getPrice()>=Constants.MEXPENSIVE)
			return "EXPENSIVE";
		else if(getPrice()>=Constants.MAVERAGE)
			return "AVERAGE";
		else if(getPrice()<Constants.MCHEAP)
			return "CHEAP";
		return "";
	}
	public void display()
	{
		super.display();
		System.out.printf("%20s\n",isExpensive());
	}

	}

