package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
public static void main(String[] args) {
	List<String> list=Arrays.asList("ram","abi123","ajay","babu","56Abc","anand","vikas","#123c","giri");
	
	System.out.println("Find names start with 'a'");
	
	Stream<String> st=list.stream().filter(str->str.startsWith("a"));
	st.forEach(System.out::println);//method references
	
	
	System.out.println("Find names that contains 4 characters");
	Stream<String> st1=list.stream().filter(str->str.length()==4);
	st1.forEach(System.out::println);//method references
	
	
	System.out.println("Find the string contains only alphabets");
	list.stream().filter(str->str.matches("[a-zA-Z]+")).forEach(System.out::println);

}
}
