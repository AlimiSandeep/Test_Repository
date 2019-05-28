package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PipeLineDemo {
public static void main(String[] args) {
	List<String> list=Arrays.asList("ram","abi123","ajay","babu","56Abc","anand","vikas","#123c","giri");
	
	System.out.println("--Filter the elements that have alphabets to new list");
	List<String> list1=list.stream().filter(e->e.matches("[a-zA-Z]+")).collect(Collectors.toList());
	
	System.out.println(list1);
	
	System.out.println("---Store unique elements from list to set----");
	List<Integer> list2=Arrays.asList(10,12,15,17,20,22,25);
	
	Set<Integer> set=list2.stream().collect(Collectors.toSet());
	System.out.println(set);
	
	
	System.out.println("----------Store elements to array------");
	//Object[] arr=(Object[])list.stream().toArray(); Or
	String[] arr=(String[])list.stream().toArray(String[]::new);
	System.out.println(Arrays.toString(arr));
}
}
