package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
	public static void main(String[] args) {
		
	
	List<Integer> list=Arrays.asList(10,12,15,17,20,22,25);
	
	System.out.println("--------------Divisible by 5----------------");
	list.stream().filter(e->(e%5)==0).forEach(System.out::println);
	
	System.out.println("--------------Even numbers----------------");
	list.stream().filter(e->(e%2)==0).forEach(System.out::println);
	
	System.out.println("------------Numbers in range 15-25----------");
	
	list.stream().filter(e->e>=15 && e<=25).forEach(System.out::println);
	
	System.out.println("---------Count no of elements divisible by 10-----");
	long count=list.stream().filter(e->(e%10)==0).count();
	System.out.println(count);
	
}
}