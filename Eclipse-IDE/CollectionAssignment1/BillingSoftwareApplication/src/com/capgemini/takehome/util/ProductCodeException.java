package com.capgemini.takehome.util;

public class ProductCodeException extends Exception{

	@Override
	public String toString() {
		return "Product code must be 4 digits";
	}

}
