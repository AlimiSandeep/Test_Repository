package com.cg.demos;

import java.util.Scanner;

public class CircleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number");
		int number = sc.nextInt();
        System.out.println( FindOddEven( number));
        System.out.println(FindPositiveNegative(number));
         
	}

	public static String FindOddEven(int number) {
		if (number % 2 == 0)

			return "even";

		else

			return "odd";

	}

	public static String FindPositiveNegative(int number) {

		if (number > 0)
			return "positive";
		else if (number < 0)
			return "negative";
		else
			return "zero";
	}
}
