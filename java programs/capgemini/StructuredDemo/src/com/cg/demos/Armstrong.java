package com.cg.demos;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println(FindLength(number));
		int pow = FindLength(number);
		System.out.println(findArmstrong(number, pow));
		sc.close();

	}

	public static int FindLength(int number) {
		int count = 0;
		while (number > 0) {

			number = number / 10;
			++count;

		}

		return count;
	}

	public static String findArmstrong(int number, int pow) {
		int sum = 0;
		int num1 = number;
		while (num1> 0) {
			int f = num1 % 10;
			sum = sum + (int) Math.pow(f, pow);
			num1 = num1 / 10;
		}
		if (sum == number)
			return "armstrong";
		else
			return "not armstrong";
	}

}
