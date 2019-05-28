package com.cg.client;

import com.cg.service.Emp;

public class EqualsDemo {
	public static void main(String[] args) {
		Emp emp1=new Emp(1001,"ram");
		Emp emp3=new Emp(1001,"ram");
		System.out.println(emp1==emp3);
		System.out.println(emp1.equals(emp3));
		
	}

}
