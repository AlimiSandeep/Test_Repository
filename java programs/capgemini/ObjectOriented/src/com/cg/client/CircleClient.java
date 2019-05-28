package com.cg.client;
import com.cg.util.CgUtil;
import com.cg.service.Circle;
import java.util.Scanner;

public class CircleClient {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius=scan.nextDouble();
		try{
			Circle circle=new Circle(radius);
			System.out.println("Area= "+circle.calcArea());
			System.out.println("Perimeter= "+circle.calcPerimeter());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
