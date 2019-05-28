package com.cg.pack1;

public class MyThread extends Thread {

	@Override
	public void run() {
	for(int i=1;i<=100;i++){
		Thread.yield();
	System.out.println(Thread.currentThread().getName()+" "+ i*5);
	}
	
	}
	
}
