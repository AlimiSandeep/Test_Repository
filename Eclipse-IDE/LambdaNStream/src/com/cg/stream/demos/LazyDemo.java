package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyDemo {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ram", "ab123", "ajay", "babu", "anand", 
				"vikas", "56Abc", "abay", "giri","#123c");
		Stream<String> st = lst.stream().filter(e->e.length()>=4).peek(System.out::println);
		System.out.println("---------------------------------------------");
		System.out.println(st.count());

	}

}
