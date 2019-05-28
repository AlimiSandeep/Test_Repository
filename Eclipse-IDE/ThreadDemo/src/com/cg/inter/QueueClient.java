package com.cg.inter;

public class QueueClient {

	public static void main(String[] args) {

		Queue que = new Queue();
		ProducerThread t1 = new ProducerThread(que);
		ConsumerThread t2 = new ConsumerThread(que);
		
		t1.start();
		t2.start();

	}

}
