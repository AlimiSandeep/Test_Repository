package com.cg.customerapp.exceptions;

public class NotFoundException extends Exception{

	@Override
	public String toString() {
		
		return "Customer not found";
	}

}
