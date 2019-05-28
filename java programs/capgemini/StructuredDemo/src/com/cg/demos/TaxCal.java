package com.cg.demos;

import java.util.Scanner;

public class TaxCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Amount");
		double amount = sc.nextDouble();
		System.out.printf("Tax=%.2f", findTax(amount));
		sc.close();

	}

	public static double findTax(double amount)
	{
		double tax=0;
		if(amount<=500000)
			return tax;
			
			
		else if((amount>500000) && (amount<=1000000)) 
			return amount*0.1;
		else if((amount>1000000) && (amount<=2000000))
			return amount*0.15;
		else
			return amount*0.2;
	}
}
