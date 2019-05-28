package com.cg.client;

import com.cg.service.Computer;
import com.cg.service.Flipkart;
import com.cg.service.Mobile;

public class ProductClient {
	public static void main(String[] args) {
		Flipkart[] obj=new Flipkart[4];
		obj[0]=new Computer(1001, "MacBook", 1000000);
		obj[1]=new Computer(1002, "Dell", 50000);
		obj[2]=new Mobile(1003, "IPHONE", 75000);
		obj[3]=new Mobile(1004, "Xiaomi", 9000);
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%10s%10s%10s%10s%20s\n","PRODUCT","PID","PNAME","PRICE","IS-EXPENSIVE");
		System.out.println("--------------------------------------------------------------");

		for(Flipkart flipkart:obj)
			display(flipkart);
	}
public static void display(Flipkart flipkart){
flipkart.display();}

}
