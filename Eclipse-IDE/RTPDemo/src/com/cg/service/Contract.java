package com.cg.service;

public class Contract extends Emp {
	private int days;

	public Contract(int empId, String empName, double sal, int days) {
		super(empId, empName, sal);
		this.days = days;
	}

	@Override
	public double calcSal() {
		
		return getSal()*days;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10s%10s%10d%15.2f\n","NA","NA",days,calcSal());;
	}

}
