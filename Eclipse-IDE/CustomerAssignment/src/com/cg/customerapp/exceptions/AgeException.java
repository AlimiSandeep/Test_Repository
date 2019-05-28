package com.cg.customerapp.exceptions;

public class AgeException extends Exception {

	@Override
	public String toString() {
		return "Age must be in between 20 and 60";
	}

}
