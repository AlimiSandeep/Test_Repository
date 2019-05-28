package com.cg.flowcontrolAndExceptions;

import java.util.Scanner;

public class Exercise_3 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=in.nextInt();
	int count=0;
	for(int i=2;i<=num;i++)
	{
		count=0;
		for(int j=1;j<=i/2;j++)
		{
			if(i%j==0)
			count++;
		}
		if(count==1)
			System.out.print(i+" ");
	}
	
}
}
