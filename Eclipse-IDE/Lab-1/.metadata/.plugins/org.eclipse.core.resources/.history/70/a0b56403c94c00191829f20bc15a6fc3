package com.cg.str;

import java.util.stream.Stream;

public class StringDemo1 {
	public static void main(String[] args) {
		String str1="rAm kUMar";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.indexOf("k"));
		System.out.println(str1.charAt(5));
		System.out.println(str1.length());
		System.out.println(str1.substring(0, 4));
		System.out.println(str1.startsWith("r"));
		System.out.println(str1.endsWith("r"));
		System.out.println(str1.matches("[a-zA-Z]+[\\s]+[a-zA-Z]+"));
		
		String str2="AP-01-7777";
		String arr[]=str2.split("-");
		Stream.of(arr).forEach(System.out::println);
		
		
		String str3=str2.replace("-", "/");
		System.out.println(str3);
		
		
		String str4=str2.replaceAll("[1-9]", "X");
		System.out.println(str4);
		
		System.out.println(str1.contains("UMa"));
		
		String str5="          ram         ";
		System.out.println("Before trimming "+str5.length());
		System.out.println(str5);
		String str6=str5.trim();
		System.out.println("after trimming "+str6.length());
		System.out.println(str6);
		
		 
	}

}
