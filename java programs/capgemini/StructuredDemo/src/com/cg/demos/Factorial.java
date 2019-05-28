package com.cg.demos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		long fact = 1;
		if (num == 0)

			System.out.println(1);
		else {
			for (int i = 1; i <= num; i++)

				fact = fact * i;

			System.out.println(fact);
		}
	}
}
