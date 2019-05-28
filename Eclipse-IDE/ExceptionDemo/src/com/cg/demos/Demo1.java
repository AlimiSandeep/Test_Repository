package com.cg.demos;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Line-1");
		System.out.println("Line-2");
		try{
		int a=9/0;}
		catch(ArithmeticException e){
		e.printStackTrace();}
		System.out.println("Line-3");
		System.out.println("Line-4");

	}

}
