package com.cg.service;

public class Onroll extends Emp {
	private double pf;
	private double hra;
	public Onroll(int empId, String empName, double sal) {
		super(empId, empName, sal);
		this.pf = getSal()*0.12;
		this.hra =getSal()*0.2;
	}
	@Override
	public double calcSal() {
		return getSal()+hra-pf;
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%10s%15.2f\n",pf,hra,"NA",calcSal());
	}
	

}
