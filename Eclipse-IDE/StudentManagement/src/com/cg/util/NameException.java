package com.cg.util;

public class NameException extends Exception {

	@Override
	public String toString() {
		
		return "Name cannot be empty or donot contain non-alphabets";
	}

}
