package com.cg.service;

public abstract class Emp {
private int empId;
private String empName;
private double sal;
public Emp(int empId, String empName, double sal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.sal = sal;
}
public int getEmpId() {
	return empId;
}
public String getEmpName() {
	return empName;
}
public double getSal() {
	return sal;
}
public abstract double calcSal();
public void display()
{
	String etype=getClass().getSimpleName();
	System.out.printf("%10s%10d%10s%10.2f",etype,empId,empName,sal);
	
}
}
