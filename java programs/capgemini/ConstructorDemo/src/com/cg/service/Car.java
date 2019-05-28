package com.cg.service;

public class Car {
	int carId;
	String carName;
	double price;

	public Car(int carId) {
		//super();
		//this(1);
		//this(1."abc");
		this.carId = carId;
		System.out.println("One argument constructor");
	}
	
	public Car(int carId,String carName) {
		this(carId);
		this.carName=carName;
		System.out.println("Two argument constructor");
	}
	public Car(int carId, String carName, double price) {
		this(carId,carName);
		this.price = price;
		System.out.println("Three arg constructor");
	}
}
