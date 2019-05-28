package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(33,10,12,27,15,17,20,22,25);
		System.out.println("-----find divisible by 5---------");
		lst.stream().filter(e->e %5 ==0).forEach(System.out::println);
		
		System.out.println("------find thge even numbers--------");
		lst.stream().filter(e->e %2 ==0).forEach(System.out::println);
		
		System.out.println("---------numbers between 15 and 25------");
		lst.stream().filter(e->e >= 15 && e <= 25).forEach(System.out::println);
		
		System.out.println("--------count no of elements divisible by 10--------");
		long count = lst.stream().filter(e->e %5 ==0).count();
		System.out.println(count);
	}

}
