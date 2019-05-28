package com.cg.customerapp.exceptions;

public class NameException extends Exception {

	@Override
	public String toString() {
		return "Name must start with uppercase and  contains only alphabets with min size 3";
	}

}
