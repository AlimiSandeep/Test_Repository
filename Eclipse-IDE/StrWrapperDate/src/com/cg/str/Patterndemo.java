package com.cg.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterndemo {
public static void main(String[] args) {
	String str="AP-15-XY-2019";
	Pattern pattern =Pattern.compile("[0-9]+");
	Matcher matcher=pattern.matcher(str);
	System.out.println(matcher.matches());//returns false
	
	while(matcher.find()){
	System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
	}
}
}