package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class MatchDemo {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(5, 10, 15, 5, 15, 20, 22, 22);
		boolean res1 = lst.stream().anyMatch(e -> e % 5 == 0);
		boolean res2 = lst.stream().allMatch(e -> e % 5 == 0);
		boolean res3 = lst.stream().noneMatch(e -> e >= 100);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
