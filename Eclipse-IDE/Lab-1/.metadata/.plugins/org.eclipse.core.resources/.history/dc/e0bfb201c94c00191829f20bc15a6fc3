package com.cg.que;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ProducerThread extends Thread {
	private static Scanner scan = new Scanner(System.in);
	private ConcurrentLinkedQueue<String> que;

	public ProducerThread(ConcurrentLinkedQueue<String> que) {
		super();
		this.que = que;
	}

	public void run() {
		for (int idx = 1; idx <= 10; ++idx) {
			System.out.println("Enter the data to produce");
			String str = scan.next();
			/*try
			{
				que.offer(str);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}*/
			que.offer(str);

			
		}
	}

}
