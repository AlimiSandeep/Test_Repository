package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.exceptions.IDExceptions;
import com.cg.vo.Emp;

public class MemDaoImpl implements IEmpDao {
	private static Map<Integer, Emp> emap;
	static {
		emap = new HashMap<>();
		emap.put(1007, new Emp(1007, "ram", 3400, "hr"));
		emap.put(1001, new Emp(1001, "tom", 2400, "pr"));
		emap.put(1005, new Emp(1005, "sai", 4400, "hr"));
		emap.put(1009, new Emp(1009, "surya", 3800, "pr"));
	}
	MemDaoImpl(){
		
	}

	@Override
	public int addEmployee(Emp emp) throws IDExceptions {
		if (emap.containsKey(emp.getEid()))
			throw new IDExceptions("ID already existed");
		emap.put(emp.getEid(), emp);
		return 1;
	}

	@Override
	public Emp viewEmployee(int eid) throws IDExceptions {
		if (!emap.containsKey(eid))
			throw new IDExceptions("employee not found");
		return emap.get(eid);
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<Emp>();
		lst.addAll(emap.values());
		return lst;
	}

	@Override
	public int removeEmployee(int eid) throws IDExceptions {
		if (emap.containsKey(eid)) {
			emap.remove(eid);
			return 1;
		} else
			throw new IDExceptions("Employee id not found");
	}

	@Override
	public int editSalary(int eid, double sal) throws IDExceptions {
		if (emap.containsKey(eid)) {
			Emp emp = emap.get(eid);
			emp.setSal(sal);
			return 1;
		} else
			throw new IDExceptions("Emp id not found");
	}

}
