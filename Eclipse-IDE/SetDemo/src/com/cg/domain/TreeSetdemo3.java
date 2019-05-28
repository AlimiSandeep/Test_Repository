package com.cg.domain;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetdemo3 {
	public static void main(String[] args) {
		Emp e1=new Emp(1001,"Ram",45000);
		Emp e2=new Emp(1003,"Ram",45466);
		Emp e3=new Emp(1007,"Shyam",45100);
		Emp e4=new Emp(1005,"Tom",545745);
		Emp e5=new Emp(1002,"zebra",45500);
		Comparator nc=new NameComparator();
		Set<Emp> set=new TreeSet<>(nc);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		for(Emp emp:set)
		{
			System.out.println(emp);
		}
		
		
}
}
