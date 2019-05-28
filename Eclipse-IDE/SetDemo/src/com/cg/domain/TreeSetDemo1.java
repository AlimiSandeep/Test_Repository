package com.cg.domain;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
public static void main(String[] args) {
	Emp e1=new Emp(1001,"Ram",45000);
	Emp e2=new Emp(1003,"Om",45466);
	Emp e3=new Emp(1007,"Shyam",84556);
	Emp e4=new Emp(1005,"Tom",545745);
	Emp e5=new Emp(1002,"zebra",456456);

	Set<Emp> set=new TreeSet<>();
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
