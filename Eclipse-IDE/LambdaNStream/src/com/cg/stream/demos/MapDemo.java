package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(6, 2, 7, 3, 4, 5);
		System.out.println("---squares of each element-------");
		Stream<Integer> st = lst.stream().map(e -> e * e);
		st.forEach(System.out::println);

		System.out.println("---------cubes of each element-----");
		Stream<Integer> st1 = lst.stream().map(e -> e * e * e);
		st1.forEach(System.out::println);

		System.out.println("----display n power n-------");
		lst.stream().map(e -> Math.pow(e, e)).forEach(System.out::println);

		System.out.println("----display n/2-------");
		lst.stream().map(e -> e / 2.0).forEach(System.out::println);
	}

}
