package com.cg.str;

public class StringDemo2 {
	public static void main(String[] args) {
		String str1="ram kumar";
		StringBuffer sb=new StringBuffer(str1);
		System.out.println(sb.append(" Reddy"));
		System.out.println(sb.insert(4, "raj"));
		System.out.println(sb.replace(7, 13, " khan "));
		System.out.println(sb.delete(7, 12));
		System.out.println(sb.substring(4, 7));
		System.out.println(sb.reverse());
		
		String str=sb.toString();//Converts stringbuffer to string
		System.out.println(str);
	}

}
