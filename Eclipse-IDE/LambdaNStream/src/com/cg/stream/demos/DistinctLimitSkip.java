package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class DistinctLimitSkip {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ram", "ajay", "babu", "ram", 
				"vikas", "giri", "abay");
		
		System.out.println("---distinct----------");
		long count = lst.stream().distinct().count();
		System.out.println(count);
		
		lst.stream().distinct().forEach(System.out::println);
		
		System.out.println("--------limit 2----------");
		lst.stream().limit(2).forEach(System.out::println);
		
		System.out.println("----------skip 2----------");
		lst.stream().skip(2).forEach(System.out::println);

	}

}
