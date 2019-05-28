package com.cg.service;

public class AgeException extends Exception {

	@Override
	public String toString() {
		return "Age must be between 20 and 50.";
	}

}
