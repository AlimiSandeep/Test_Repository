package com.cg.service;

import java.util.List;

import com.cg.vo.Employee;

public interface EmpService {
int addEmployee(Employee emp);
Employee findInsuranceScheme(int eid);
List<Employee> viewEmp();

}
