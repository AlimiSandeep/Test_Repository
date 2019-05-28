package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.exceptions.IdException;
import com.cg.vo.Emp;

public class MemDaoImpl implements IEmpDao {
	private static Map<Integer,Emp> emap;
	
	static
	{
		emap=new HashMap<>();
		emap.put(1007, new Emp(1007,"ram",34000,"hr"));
		emap.put(1001, new Emp(1001,"tom",24000,"pr"));
		emap.put(1005, new Emp(1005,"sam",44000,"hr"));
		emap.put(1009, new Emp(1009,"surya",38000,"pr"));
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		if(emap.containsKey(emp.getEid()))
			throw new IdException("ID already exists");
		
		emap.put(emp.getEid(),emp);
		return 1;
	}

	@Override
	public Emp viewEmployee(int eid) throws IdException {
	if(!emap.containsKey(eid))
		throw new IdException("Employee not found");
	
		
		return emap.get(eid);
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> list=new ArrayList<Emp>();
		list.addAll(emap.values());
		return list;
	}

	@Override
	public int removeEmployee(int eid) throws IdException {
	if(emap.containsKey(eid))
	{
		emap.remove(eid);
		return 1;
	}
	else
		throw new IdException("Employee id not found");
	}

	@Override
	public int editSalary(int eid, double sal) throws IdException {
		if(!emap.containsKey(eid))
			throw new IdException("Employee not found");
		Emp emp=emap.get(eid);
		emp.setSal(sal);
		return 1;
	}

}
