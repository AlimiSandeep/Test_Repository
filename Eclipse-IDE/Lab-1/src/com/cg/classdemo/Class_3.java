package com.cg.classdemo;

import java.util.Scanner;

public class Class_3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	if(checkNumber(num))
		System.out.println("Increasing Number");
	else
		System.out.println("Not increasing number");
}
public static boolean checkNumber(int num)
{
String str=Integer.toString(num);
for(int i=0;i<str.length()-1;i++)
	if(str.charAt(i)>str.charAt(i+1))
		return false;


return true;
}
}