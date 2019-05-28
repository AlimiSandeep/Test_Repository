package com.cg.stream.domain;

import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		
		List<Emp> lst = EmpUtil.getEmployee();
        System.out.println("-----order by id-----------");
		lst.stream().sorted().forEach(EmpUtil::display);
		
		System.out.println("-----order by name---------");
		lst.stream().sorted((e1,e2)->{return e1.compareTo(e2);}).
		                                  forEach(EmpUtil::display);
		
		System.out.println("--------descending order by sal--------");
		lst.stream().sorted((e1,e2)->{Double sal2=e2.getSal();
		                           return sal2.compareTo(e1.getSal());})
		                              .forEach(EmpUtil::display);

	}

}
