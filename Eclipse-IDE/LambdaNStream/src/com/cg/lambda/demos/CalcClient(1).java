package com.cg.lambda.demos;

public class CalcClient {
//it creates a class, interface by sending data to doCalc and then is passed to method.
	public static void main(String[] args) {
		
		display((a,b)->{return a+b;},10,20);
		display((a,b)->{return a-b;},10,20);
		display((a,b)->{return a*b;},10,20);
		
		

	}
	public static void display(ICalc calc, int a, int b) {
		System.out.println(calc);
		System.out.println(calc.doCalc(a,b));
	}
	

}
