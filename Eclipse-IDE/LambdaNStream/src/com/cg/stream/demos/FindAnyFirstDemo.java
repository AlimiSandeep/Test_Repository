package com.cg.stream.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAnyFirstDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		for(int i=1; i<=10000; i++) {
			lst.add(i);
		}
		System.out.println("---find first---------");
		Optional<Integer> opt = lst.parallelStream().filter(e->e%5==0).findFirst();
		System.out.println(opt.get());
		
		System.out.println("---find any---------");
		Optional<Integer> opt2 = lst.parallelStream().filter(e->e%5==0).findAny();
		System.out.println(opt2.get());


	}

}
