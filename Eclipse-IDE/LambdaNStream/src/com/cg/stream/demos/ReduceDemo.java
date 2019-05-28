package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(6, 2, 7, 3, 4, 5);
		System.out.println("accumulate all the values in the collection");
		int res = lst.stream().reduce(0, (x,y)->x+y);
		System.out.println(res);
		
		System.out.println("product all the values in the collection");
		int res1 = lst.stream().reduce(1, (x,y)->x*y);
		System.out.println(res1);


	}

}
