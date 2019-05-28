package com.cg.service;

import java.util.Scanner;

public class Cone implements Volume {
	private double radius;
	private double height;
	@Override
	public double calcVolume() {
		return (1/3)*Math.PI*radius*radius*height ;
	}
	@Override
	public void getData() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=scan.nextDouble();
		System.out.println("Enter the height:");
		height=scan.nextDouble();
		
		
	}

}
