package com.cg.service;

import java.util.Scanner;

public class Cylinder implements Volume {
private double radius;
private double height;
@Override
public double calcVolume() {
	return Math.PI*radius*radius*height ;
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
