package com.cg.operators;

import java.util.Scanner;

public class Exercise_1 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int sum=cubesOfDigitsOfNum(num);
	System.out.println(sum);
}
static int cubesOfDigitsOfNum(int num)
{
	int r,sum=0;
	while(num!=0)
	{
		r=num%10;
		sum+=Math.pow(r, 3);
		num=num/10;
		
	}
	return sum;
}
}
