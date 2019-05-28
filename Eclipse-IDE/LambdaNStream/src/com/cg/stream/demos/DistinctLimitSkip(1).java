package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class DistinctLimitSkip {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("ram","babu","anand","vikas","ram","anand","giri");
		
		System.out.println("------------Distinct--------------");
		long count=list.stream().distinct().count();
		System.out.println("No of distinct elements "+count);
		list.stream().distinct().forEach(System.out::println);
		
		
		System.out.println("----------------Limit 2----------------");
		list.stream().limit(2).forEach(System.out::println);
		
		
		System.out.println("----------------Skip 2----------------");
		list.stream().skip(2).forEach(System.out::println);

		
		
	}
}
