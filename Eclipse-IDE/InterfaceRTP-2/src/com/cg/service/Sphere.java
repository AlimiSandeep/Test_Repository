package com.cg.service;

import java.util.Scanner;

public class Sphere implements Volume {
	private double radius;

	@Override
	public double calcVolume() {
		return (4/3)*Math.PI*radius*radius*radius;
	}

	@Override
	public void getData() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=scan.nextDouble();		
	}
	

}
