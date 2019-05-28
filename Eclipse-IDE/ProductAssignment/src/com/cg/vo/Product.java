package com.cg.vo;



public class Product {
private int prodId;
private String prodName;
private double price;

Product() {
}

public int getProdId() {
	return prodId;
}


public Product(int prodId, String prodName, double price) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
}


public String getProdName() {
	return prodName;
}

public double getPrice() {
	return price;
}



@Override
public String toString() {
	return  prodId + " " + prodName + " "+ price ;
}



}
