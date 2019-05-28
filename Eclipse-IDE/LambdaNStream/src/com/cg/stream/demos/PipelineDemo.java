package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PipelineDemo {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ram", "ajay", "babu", "ram", 
				"vikas", "giri", "abay");
		
		System.out.println("--filter the elements taht have alphabets into new list----");
		List<String> lst2= lst.stream().filter(e->e.matches("[a-zA-Z]+")).collect(Collectors.toList());
		System.out.println(lst2);
		
		System.out.println("=---store unique elements from the list to set----");
		List<Integer> lst3 = Arrays.asList(5,10,15,5,15,20,22,22);
		Set<Integer> set = lst3.stream().collect(Collectors.toSet());
		System.out.println(set);
	}

}
