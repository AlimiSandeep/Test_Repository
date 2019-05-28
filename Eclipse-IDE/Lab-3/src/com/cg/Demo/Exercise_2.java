package com.cg.Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	String[] str=new String[size];
	for(int i=0;i<size;i++)
		str[i]=in.next();
		sortStrings(str);
		for(int i=0;i<size;i++)
			System.out.print(str[i]+" ");
	
	
}
public static String[] sortStrings(String[] str)
{
	Arrays.sort(str);
	int size=str.length;
	if(size%2!=0)
	{
	for(int i=0;i<(size/2)+1;i++)
		str[i]=str[i].toUpperCase();
	for(int i=(size/2)+1;i<size;i++)
		str[i]=str[i].toLowerCase();
	}
	else
	{
		for(int i=0;i<size/2;i++)
			str[i]=str[i].toUpperCase();
		for(int i=size/2;i<size;i++)
			str[i]=str[i].toLowerCase();
		}
	return str;
}
}
