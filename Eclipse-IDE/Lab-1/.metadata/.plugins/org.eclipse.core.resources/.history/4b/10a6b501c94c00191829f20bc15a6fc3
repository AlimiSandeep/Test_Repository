package com.cg.que;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueClient {
public static void main(String[] args) {
	//BlockingQueue<String> que=new ArrayBlockingQueue<>(5);
	ConcurrentLinkedQueue<String> que=new ConcurrentLinkedQueue<>();
	ProducerThread t1=new ProducerThread(que);
	ConsumerThread t2=new ConsumerThread(que);
	
	t1.start();
	t2.start();
}
}
