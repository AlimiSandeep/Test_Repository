package com.cg.inter;

import java.util.Scanner;

public class ProducerThread extends Thread {
	private static Scanner scan = new Scanner(System.in);
	private Queue que;

	public ProducerThread(Queue que) {
		super();
		this.que = que;
	}

	public void run() {
		for (int idx = 1; idx <= 5; ++idx) {
			System.out.println("enter the data");
			String str = scan.next();
			que.put(str);
		}
	}

}
