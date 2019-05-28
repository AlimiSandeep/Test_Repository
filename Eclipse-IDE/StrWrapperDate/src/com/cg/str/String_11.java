package com.cg.str;

import java.util.Scanner;

public class String_11 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	//StringBuffer sb1=new StringBuffer(in.next());
	//String sb1 = in.next();
	String sb1 = "XY1XY";
	String sb2 = "XY";
	//StringBuffer sb2=new StringBuffer(in.next());
	StringBuffer res=new StringBuffer("");
	int index;
/*	do
	{
		index=sb.indexOf(sb1.toString());
		System.out.println(index);
		res+=(sb.charAt(index-1));
		res+=(sb.charAt(index+sb1.length()));
		//sb.delete(index, index+sb1.length());
		System.out.println(res);
		//System.exit(0);
		
	}while(index>=0);*/
	do
	{
	int len =sb2.length();	
	index=sb1.indexOf(sb2.toString());
	if(index <0)
		break;
	if((index -1) >=0)
	  res.append(sb1.charAt(index -1));
	if((index + len) < sb1.length())
	    res.append(sb1.charAt(index+len));
	sb1=sb1.substring(index+len);
	}while(true);
	
	System.out.println(res);
}
}
