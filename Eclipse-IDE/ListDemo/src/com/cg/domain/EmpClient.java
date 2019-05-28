package com.cg.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpClient {
	public static void main(String[] args) {
		Emp e1=new Emp(1045,"Ram",45000);
		Emp e2=new Emp(1234,"Om",45466);
		Emp e3=new Emp(1078,"Shyam",84556);
		Emp e4=new Emp(1099,"Tom",545745);
		Emp e5=new Emp(1000,"zebra",456456);
		List<Emp> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("----------------Sort by Eid-------------------");
		list.sort(null);
		
		for(Emp emp:list)
		{
			System.out.println(emp);
		}
		

		System.out.println("----------------Sort by Ename-------------------");
		Comparator<Emp> nc=new NameComparator();
		list.sort(nc);
		for(Emp emp:list)
		{
			System.out.println(emp);
		}
		
		System.out.println("----------------Sort by Salary-------------------");
		Comparator<Emp> salComparator=new SalaryComparator();
		list.sort(salComparator);
		for(Emp emp:list)
		{
			System.out.println(emp);
		}
		

	}

}
