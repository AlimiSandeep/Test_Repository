package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(6,2,7,3,4,5);
		System.out.println("Accumulating/summing the values in the collection");
		int res=list.stream().reduce(0,(x,y)->x+y);
		System.out.println(res);
		
		System.out.println("Product of all the values in the collection");
		int res1=list.stream().reduce(1,(x,y)->x*y);
		System.out.println(res1);
		
}
}