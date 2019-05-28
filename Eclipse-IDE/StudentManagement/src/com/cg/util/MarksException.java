package com.cg.util;

public class MarksException extends Exception{

	@Override
	public String toString() {
		return "Marks range is in between 0 to 100 only ";
	}

}
