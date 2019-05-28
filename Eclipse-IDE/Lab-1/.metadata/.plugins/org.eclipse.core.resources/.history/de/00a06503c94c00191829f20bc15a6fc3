package com.cg.str;

public class TestString {
public static void main(String[] args) {
	String str1="ram";
	String str2="ram";
	String str3=new String("ram");
	String str4=new String("ram");
	str3=str3.intern();//points to the string in constant pool instaed of pointing in the heap
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	System.out.println(str1==str3);
	System.out.println(str1==str4);
	System.out.println(str1.equals(str3));
}
}
