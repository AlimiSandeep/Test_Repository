package com.cg.pack1;


public class ThreadMain {
public static void main(String[] args) throws InterruptedException {
	MyThread t1=new MyThread();
	t1.setName("Ram");
	
	t1.setPriority(Thread.MAX_PRIORITY);
	MyThread t2=new MyThread();
	t2.setName("Sam");
	
	t2.setPriority(Thread.MIN_PRIORITY);
	
	t1.start();
	// t1.join();
	t2.start();
	// t2.join();
	
	for(int i=1;i<=100;i++)
		System.out.println(Thread.currentThread().getName()+" "+ i*5);


	
}
}
