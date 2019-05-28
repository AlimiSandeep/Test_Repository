package com.cg.service;

public abstract class Flipkart {
	private int pId;
	private String pName;
	private int price;
	public Flipkart(int pId, String pName, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public abstract String isExpensive();
	public void display()
	{
		String productType=getClass().getSimpleName();
		System.out.printf("%10s%10d%10s%10s",productType,pId,pName,price);

	}

}
