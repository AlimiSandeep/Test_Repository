package com.cg.primitive;

import java.util.SortedSet;
import java.util.TreeSet;

public class BackedDemo1 {
	public static void main(String[] args) {
		
	
	TreeSet<String> set=new TreeSet<>();
	System.out.println(set.add("ram"));
	System.out.println(set.add("sam"));
	System.out.println(set.add("tom"));
	System.out.println(set.add("peter"));
	System.out.println(set.add("ravi"));
	
	//It Inserts an elements that must been between starting with 'p' to 't'
	SortedSet<String> ss=set.subSet("peter","tom");
	ss.add("raju");//It adds bcz starting char is r which is in range of p and t
	ss.add("vinay");//Exception raises bcz starting char is v which is not in between range p and t
	for(String str:set)
	{
		System.out.println(str);
	}
	
	
	
}
}