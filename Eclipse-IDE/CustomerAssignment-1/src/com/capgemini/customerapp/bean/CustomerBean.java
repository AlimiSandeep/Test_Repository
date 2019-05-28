package com.capgemini.customerapp.bean;

public class CustomerBean {

	private int id;
	private String name;
	private String locality;
	private int age;
	
	public CustomerBean() {
		
	}

	public CustomerBean(int id, String name, String locality, int age) {
		super();
		this.id = id;
		this.name = name;
		this.locality = locality;
		this.age = age;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", locality=" + locality + ", age=" + age + "]";
	}
	

	
}
