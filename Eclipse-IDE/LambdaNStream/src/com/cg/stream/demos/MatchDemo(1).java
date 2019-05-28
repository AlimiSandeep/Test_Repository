package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class MatchDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,12,15,17,20,22,25);
		boolean res1=list.stream().anyMatch(e->e%5==0);
		boolean res2=list.stream().allMatch(e->e%5==0);
		boolean res3=list.stream().noneMatch(e->e>=100);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
