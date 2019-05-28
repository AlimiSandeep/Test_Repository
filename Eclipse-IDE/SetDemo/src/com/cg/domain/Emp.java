package com.cg.domain;

public class Emp implements Comparable<Emp> {
	private int eid;
	private String ename;
	private double sal;
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return eid + " " + ename + " "+sal;
	}

	
	
	//Override hashcode() for hash collision
	//Override hashcode() and equals() for avoiding duplicates based on the content
	@Override
	public int hashCode() {
		return eid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Emp emp=(Emp)obj;
		if(this==emp)
			return true;
		if(this.eid==emp.eid)
			return true;
		else
			return false;
	}
	
	
	
	@Override
	public int compareTo(Emp emp) {
	/*	if(this.eid>emp.eid)
			return 1;
		if(this.eid<emp.eid)
			return -1;
		else
			return 0;*/
		return ((Integer)this.eid).compareTo(emp.eid);
		
	}
	

}
