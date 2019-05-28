package com.cg.Demo;

import java.util.Scanner;

public class Exercise_1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	System.out.println(getSecondSmallest(arr));
}
public static int getSecondSmallest(int[] arr)
{
	int first=-1,second=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>first)
		{
			second=first;
			first=arr[i];
		}
	}
	return second;
}
}
