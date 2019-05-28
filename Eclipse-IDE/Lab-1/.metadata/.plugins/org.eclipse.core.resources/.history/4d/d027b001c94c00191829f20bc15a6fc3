package com.cg.que;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConsumerThread extends Thread {
	private ConcurrentLinkedQueue<String> que;

	public ConsumerThread(ConcurrentLinkedQueue<String> que) {
		super();
		this.que = que;
	}

	public void run() {
		for (int idx = 1; idx <= 10; ++idx) {
			try
			{
				Thread.sleep(5000);
				System.out.println("Consume:"+que.poll());
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
