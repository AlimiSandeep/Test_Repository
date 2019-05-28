

package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(6,2,7,3,4,5);
		
		System.out.println("----Display square of elements----");
		list.stream().map(e->e*e).forEach(System.out::println);
	
		System.out.println("----Display cube of elements----");
		list.stream().map(e->e*e*e).forEach(System.out::println);
		
		System.out.println("----Display n pow n----");
		list.stream().map(e->Math.pow(e, e)).forEach(System.out::println);
		
		System.out.println("----Divided n/2-----");
		list.stream().map(e->e/2).forEach(System.out::println);


	
	
	}

}
