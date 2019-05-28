package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ram", "ab123", "ajay", "babu", "anand", 
				"vikas", "56Abc", "abay", "girl");
		System.out.println("--------file name starts with a--------");
		Stream<String> st = lst.stream().filter(str -> str.startsWith("a"));
		st.forEach(System.out::println);// method references

		System.out.println("-----find the names that contains 4 chars---------");
		Stream<String> st2 = lst.stream().filter(str -> str.length() == 4);
		st2.forEach(System.out::println);
		
		System.out.println("-----find the string contains only alphabets-----");
		lst.stream().filter(str->str.matches("[a-z,A-Z]+")).forEach(System.out::println);
	}
}