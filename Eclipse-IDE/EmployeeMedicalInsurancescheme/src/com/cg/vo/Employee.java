package com.cg.vo;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		if(salary>=40000)
		{
			this.designation="Manager";
			this.insuranceScheme="Scheme A";
		}
		else if(salary>=20000 && salary<40000){
			this.designation="Programmer";
			this.insuranceScheme="Scheme B";

		}
		else if(salary>5000 && salary<20000){
				this.designation="System Associate";
				this.insuranceScheme="Scheme C";

		}
		else
		{
			this.designation="Clerk";
			this.insuranceScheme="No scheme";


		}
	}

	@Override
	public String toString() {
		return id +" "+ name +" "+ salary +" "+ designation +" "+ insuranceScheme;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public int getId() {
		return id;
	}
	
	
}
