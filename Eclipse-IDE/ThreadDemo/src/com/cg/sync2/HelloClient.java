package com.cg.sync2;

public class HelloClient {

	public static void main(String[] args) {
		Hello obj = new Hello();
		HelloThread t1 = new HelloThread(obj);
		t1.setName("ram");
		
		HelloThread t2 = new HelloThread(obj);
		t2.setName("tom");
		
		t1.start();
		t2.start();
		

	}

}
