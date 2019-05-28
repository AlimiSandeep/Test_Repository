package com.cg.stream.domain;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Emp> lst = EmpUtil.getEmployee();
		System.out.println("---dispaly employee for given dept-----");
		lst.stream().filter(e->e.getDept().equals("hr")).forEach(EmpUtil::display);
		
		System.out.println("-------find employee earnssalary >=50000 ");
		lst.stream().filter(e->e.getSal()>=50000).forEach(EmpUtil::display);
		System.out.println("-----count the employees for the given dept----");
		long count = lst.stream().filter(e->e.getDept().equals("pr")).count();
		System.out.println("no of employees in pr="+ count);
		
		System.out.println("-----display and copunt employee earns between 25000 and 40000-----");
		long count2 = lst.stream().filter(e->e.getSal()>=25000 && e.getSal()<=40000).peek(EmpUtil::display).count();
		System.out.println("no of employees earning 25000-40000 ="+ count2);
	}

}
