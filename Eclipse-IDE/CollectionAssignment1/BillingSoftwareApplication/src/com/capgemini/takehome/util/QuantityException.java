package com.capgemini.takehome.util;

public class QuantityException extends Exception {

	@Override
	public String toString() {
		
		return "Quantity should be more than zero";
	}

}
