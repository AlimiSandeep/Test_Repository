package com.cg.stream.domain;

import java.util.List;

public class SubQryDemo {

	public static void main(String[] args) {
		List<Emp> lst = EmpUtil.getEmployee();
		System.out.println("------employee earning maximum sal------");
		Double max = lst.stream().mapToDouble(e -> e.getSal()).max().getAsDouble();
		lst.stream().filter(e->e.getSal() == max).forEach(EmpUtil::display);
		
		System.out.println("------employee earning minimum sal------");
		Double min = lst.stream().mapToDouble(e -> e.getSal()).min().getAsDouble();
		lst.stream().filter(e->e.getSal() == min).forEach(EmpUtil::display);
		
		System.out.println("------employee earning below average sal------");
		Double avg = lst.stream().mapToDouble(e -> e.getSal()).average().getAsDouble();
		lst.stream().filter(e->e.getSal() <= avg).forEach(EmpUtil::display);
	}

}
