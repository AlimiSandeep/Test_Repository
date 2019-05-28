package com.cg.inter;

public class ConsumerThread extends Thread {
	private Queue que;

	public ConsumerThread(Queue que) {
		super();
		this.que = que;
	}

	public void run() {
		for (int idx = 1; idx <= 5; ++idx) {

			que.get();
		}
	}

}
