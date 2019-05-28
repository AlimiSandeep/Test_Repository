package com.capgemini.takehome.bean;

public class Product {
private int prodId;
private String prodName;
private String prodCategory;
private double price;
public Product(int prodId, String prodName, String prodCategory, double price) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodCategory = prodCategory;
	this.price = price;
}
public int getProdId() {
	return prodId;
}
public String getProdName() {
	return prodName;
}
public String getProdCategory() {
	return prodCategory;
}
public double getPrice() {
	return price;
}

@Override
public String toString() {
	return  prodId + " " + prodName + " " + prodCategory + " "+ price ;
}

}
