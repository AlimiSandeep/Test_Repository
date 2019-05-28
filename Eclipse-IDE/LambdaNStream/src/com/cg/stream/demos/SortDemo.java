package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ram", "babu", "anand", "vikas", "girl");
		Stream<String> st = lst.stream().sorted();
		st.forEach(str -> System.out.println(str));// internal for loop

		// descending order
		System.out.println("-------------descending order-------------");
		Stream<String> st2 = lst.stream().sorted((str1, str2) -> 
		{return str2.compareTo(str1);});
		st2.forEach(str -> System.out.println(str));

		// original list get unchanged
		System.out.println("---------original list---------------");
		System.out.println(lst);
	}

}
