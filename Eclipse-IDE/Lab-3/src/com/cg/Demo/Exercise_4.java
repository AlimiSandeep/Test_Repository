package com.cg.Demo;

import java.util.Scanner;

public class Exercise_4 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	char arr[]=new char[n];
	for(int i=0;i<n;i++)
		arr[i]=in.next().charAt(0);
		countOccurences(arr);
}
static void countOccurences(char[] arr)
{
	int count[]=new int[256] ;char ch;
	for(int i=0;i<arr.length;i++)
		count[arr[i]]++;
	for(int i=0;i<256;i++)
	{
		if(count[i]!=0)
		{
			
			System.out.println((char)i+" has occured "+count[i]+" times");
		}
			
	}
	
	
}
}
