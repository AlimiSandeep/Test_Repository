package com.cg.ch;

public class Emp implements Comparable<Emp> {
private int eid;
private String ename;
private double sal;
private String dept;
public Emp(int eid, String ename, double sal, String dept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
	this.dept = dept;
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
public String getDept() {
	return dept;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return eid + " " + ename + " " + sal + " " + dept;
}
@Override
public int compareTo(Emp emp) {
	
	return ((Integer)this.eid).compareTo(emp.eid);
}



}

