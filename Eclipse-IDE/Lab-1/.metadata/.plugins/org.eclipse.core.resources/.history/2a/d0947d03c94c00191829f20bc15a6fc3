package com.cg.sync;

public class Account {
	public synchronized void deposit() {
		for(int i=1; i<=2000; ++i) {
			System.out.println(Thread.currentThread().getName()+"doing tx");
		}
	}
	
	public synchronized void getBalance() {
		System.out.println(Thread.currentThread().getName()+"get balance");
	}

}
