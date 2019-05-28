package com.cg.service;

import com.cg.Util.Constants;

public class Computer extends Flipkart {
	public Computer(int pId, String pName, int price) {
		super(pId, pName, price);
	}

	@Override
	public String isExpensive() { 
		if(getPrice()>=Constants.CEXPENSIVE)
			return "EXPENSIVE";
		else if(getPrice()>=Constants.CAVERAGE)
			return "AVERAGE";
		else if(getPrice()<Constants.CCHEAP)
			return "CHEAP";
		return "";
	}
	public void display()
	{
		super.display();
		System.out.printf("%20s\n",isExpensive());
	}

}
