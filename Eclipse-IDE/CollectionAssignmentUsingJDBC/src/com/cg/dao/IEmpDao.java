package com.cg.dao;

import java.util.List;

import com.cg.exceptions.IDExceptions;
import com.cg.vo.Emp;

public interface IEmpDao {
	public int addEmployee(Emp emp) throws IDExceptions;

	public Emp viewEmployee(int eid) throws IDExceptions;

	public List<Emp> viewEmployee();

	public int removeEmployee(int eid) throws IDExceptions;

	public int editSalary(int eid, double sal) throws IDExceptions;
 
}
