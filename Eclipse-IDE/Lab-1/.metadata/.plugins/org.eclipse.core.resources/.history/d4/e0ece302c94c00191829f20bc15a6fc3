package com.cg.stream.domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctDeptNames {
	public static void main(String[] args) {
		
		
		List<Emp> lst = EmpUtil.getEmployee();
		
		System.out.println("----------Using distinct--------------");
		lst.stream().map(e->e.getDept()).distinct().forEach(System.out::println);
		
		System.out.println("-----------Using set-------------");
		Set<String> set=lst.stream().map(e->e.getDept()).collect(Collectors.toSet());
		System.out.println(set);
		
	}

}
