package com.cg.service;

public class Palindrome {
public boolean checkPalindrome(String str)
{
	if(str==null)
		return false;
	str=str.trim();
	if(str.length()<=0)
		return false;
	StringBuffer buff=new StringBuffer(str);
	String rev=buff.reverse().toString();
	if(str.equalsIgnoreCase(rev))
		return true;
	else
		return false;
}
}
