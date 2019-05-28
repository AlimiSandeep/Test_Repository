package com.cg.primitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Balayya");
		list.add("Babu");
		list.add("Thopu");
		list.add("Dammunte");
		list.add("Aapu");
		list.add("Aapu");
		System.out.println(list);
		
		list.add(0,"Jai");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.remove("Aapu");
		System.out.println(list.get(0));
		
		list.sort(null);
		System.out.println(list);
		
		Set<String> set=new HashSet<>();
		set.add("Varun");
		set.add("Teja");
		list.addAll(set);
		System.out.println();
		
		
}
}
