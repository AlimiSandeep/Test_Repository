package com.cg.primitive;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(1001);
		set.add(1005);
		set.add(1004);
		set.add(1007);
		set.add(2002);
		set.add(2005);
		set.add(2003);
			
		for(int res:set)
		{
			System.out.println(res);
		}
	}

}
