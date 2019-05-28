package com.cg.classes;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Exercise3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
		arr=getSorted(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
static int[] getSorted(int[] arr)
{
	
	for(int i=0;i<arr.length;i++)
	{
		StringBuffer str=new StringBuffer("");
		str.append(arr[i]);
		str.reverse();
		arr[i]=Integer.parseInt(str.toString());

	
	}
	Arrays.sort(arr);
	return arr;
}

}
