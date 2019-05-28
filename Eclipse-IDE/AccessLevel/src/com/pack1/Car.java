package com.pack1;

public class Car {
private String carName="SUZUKI";

protected Car() {
	// TODO Auto-generated constructor stub
}
private void drive()
{
	System.out.println("Drive");
}
public void m1()
{
	Car car=new Car();
	System.out.println(car.carName);
	car.drive();
	}

}
