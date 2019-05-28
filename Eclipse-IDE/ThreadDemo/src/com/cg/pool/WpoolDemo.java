package com.cg.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class WpoolDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	System.out.println(Runtime.getRuntime().availableProcessors());
	
	MyCallable c1=new MyCallable(1, 1000);
	MyCallable c2=new MyCallable(1001, 2000);
	MyCallable c3=new MyCallable(2001, 3000);
	MyCallable c4=new MyCallable(3001, 4000);

	//ExecutorService pool=Executors.newFixedThreadPool(2);
	ExecutorService pool=Executors.newWorkStealingPool();
	
	Future<Integer> f1= pool.submit(c1);
	Future<Integer> f2=pool.submit(c2);
	Future<Integer> f3=pool.submit(c3);
	Future<Integer> f4=pool.submit(c4);

	
	Thread.sleep(1000)	;
	
	System.out.println(f1.get()+f2.get()+f3.get()+f4.get());
	//System.out.println(f2.get());
	//System.out.println(f3.get());
	//System.out.println(f4.get());

	pool.shutdown();
	
}
}
