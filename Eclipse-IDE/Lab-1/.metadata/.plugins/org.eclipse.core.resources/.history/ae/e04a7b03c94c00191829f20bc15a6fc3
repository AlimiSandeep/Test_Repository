package com.cg.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolDemo {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("Ram");
		MyRunnable r2 = new MyRunnable("Tom");
		MyRunnable r3 = new MyRunnable("Sam");
		MyRunnable r4 = new MyRunnable("Babu");
		MyRunnable r5 = new MyRunnable("Rahul");
		MyRunnable r6 = new MyRunnable("Shiva");

	//	ExecutorService ser = Executors.newFixedThreadPool(3);
	//	ExecutorService ser = Executors.newSingleThreadExecutor();
		ExecutorService ser = Executors.newCachedThreadPool();
	
		
		ser.execute(r1);
		ser.execute(r2);
		ser.execute(r3);
		ser.execute(r4);
		ser.execute(r5);
		ser.execute(r6);

		ser.shutdown();

	}

}
