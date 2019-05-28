package com.cg.service;

public class IncomeException extends Exception {

	
	@Override
	public String toString() {
		return "Income must be minimum of 4lakhs INR";
	}
	
}
