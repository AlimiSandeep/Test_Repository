package com.cg.stream.domain;

import java.util.List;

public class AggDemo {

	public static void main(String[] args) {
		List<Emp> lst = EmpUtil.getEmployee();
		System.out.println("----total salary----");
		Double sum = lst.stream().mapToDouble(e -> e.getSal()).sum();
		System.out.println("total sal=" + sum);

		System.out.println("----average----------");
		Double avg = lst.stream().mapToDouble(e -> e.getSal()).average().getAsDouble();
		System.out.println("average sal=" + avg);
		
		System.out.println("------maximum sal------");
		Double max = lst.stream().mapToDouble(e -> e.getSal()).max().getAsDouble();
		System.out.println("Maximum sal=" + max);
		
		System.out.println("------minimum sal------");
		Double min = lst.stream().mapToDouble(e -> e.getSal()).min().getAsDouble();
		System.out.println("Minimum sal=" + min);
		
	}

}
