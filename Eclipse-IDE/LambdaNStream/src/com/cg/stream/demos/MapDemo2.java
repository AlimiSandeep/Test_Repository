package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ram", "ajay", "babu", "anand", 
				"vikas", "giri", "abay");
		System.out.println("-----display first two letters in a string and ends with 2019-----");
		lst.stream().map(e->e.substring(0, 2).toUpperCase()+"2019").forEach(System.out::println);

	}

}
