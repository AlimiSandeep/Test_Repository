package com.cg.service;

public class Emp {
private int empId;
private String empName;
public Emp(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
@Override
public boolean equals(Object obj) {
	Emp emp=(Emp)obj;
	if(this==emp)
		return true;
	if(this.empId==emp.empId && this.empName.equals(emp.empName))
		return true;
	return false;
}
@Override
public String toString() {
	return empId+" "+empName;
}
@Override
public void finalize() throws Throwable {
	System.out.println(empId+" is a garbage collected");
}

}
