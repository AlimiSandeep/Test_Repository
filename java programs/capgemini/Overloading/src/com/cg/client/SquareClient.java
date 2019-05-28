package com.cg.client;

import com.cg.service.Square;

public class SquareClient {
	public static void main(String[] args) {
		Square s=new Square();
		System.out.println(s.calcArea(5));
	}

}
