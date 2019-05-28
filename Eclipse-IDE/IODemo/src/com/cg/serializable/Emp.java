package com.cg.serializable;

import java.io.Serializable;

public class Emp implements Serializable {
private int eid;
private transient String ename;
private double sal;
private String dept;

public Emp() {
}


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



}

