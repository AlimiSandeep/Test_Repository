package com.cg.run;

public class RunnableMain {
public static void main(String[] args) {
	MyRunnable r1=new MyRunnable();
	
	Thread t1=new Thread(r1);
	t1.setName("Ram");
	
	Thread t2=new Thread(r1);
	t2.setName("Sam");
	
	t1.start();
	t1.start();
	//t2.start();
	
	System.out.println("Main thread over............");
}
}
