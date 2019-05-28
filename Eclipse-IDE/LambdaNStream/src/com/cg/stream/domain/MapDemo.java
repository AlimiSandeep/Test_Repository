package com.cg.stream.domain;

import java.util.List;

public class MapDemo {
	public static void main(String[] args) {
		List<Emp> lst = EmpUtil.getEmployee();
		lst.stream().map(e->"2019-"+e.getEname()+"-"+e.getEid()).forEach(System.out::println);
	}

}
