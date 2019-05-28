package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyDemo {
public static void main(String[] args) {
	List<String> list=Arrays.asList("ram","abi123","ajay","babu","56Abc","anand","vikas","#123c","giri");
	Stream<String> st=list.stream().filter(e->e.length()>=4).peek(System.out::println);
	
	
	System.out.println("----------------------------------");
	System.out.println(st.count());
	
}
}
