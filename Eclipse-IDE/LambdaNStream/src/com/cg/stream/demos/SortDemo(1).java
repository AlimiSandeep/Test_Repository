package com.cg.stream.demos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("ram","babu","anand","vikas","giri");
		
		//Ascending order
		Stream<String> st=list.stream().sorted();
		st.forEach(str->System.out.println(str));
		
		System.out.println("-----------------------------------------");
		
		//Descending order
		Stream<String> st1=list.stream().sorted((str1,str2)->{return str2.compareTo(str1);});
		st1.forEach(str->System.out.println(str));
		
		
		//Original list gets unchanged i.e list doesnot get sorted
		System.out.println(list);
	}

}
