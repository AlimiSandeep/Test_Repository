package com.cg.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.vo.Employee;

public class EmpServiceimpl implements EmpService {
private static Map<Integer,Employee> emap;
static
{
	emap=new HashMap<>();
}

@Override
public int addEmployee(Employee emp) {
	if(emap.containsKey(emp.getId())){
		System.out.println("Employee already exists");
		return 0;
	}
	
	emap.put(emp.getId(), emp);
	return 1;
	


	}

@Override
public Employee findInsuranceScheme(int eid) {
	return emap.get(eid);
	
}

@Override
public List<Employee> viewEmp() {
List<Employee> list=new ArrayList<>();
list.addAll(emap.values());

	return list;
}
}
