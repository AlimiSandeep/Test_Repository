package com.capgemini.customerapp.exceptions;

public class NameException extends Exception{

	@Override
	public String toString() {
		return "Name must start with uppercase and contains minimum of 3 alphabets";
	}

	
}
