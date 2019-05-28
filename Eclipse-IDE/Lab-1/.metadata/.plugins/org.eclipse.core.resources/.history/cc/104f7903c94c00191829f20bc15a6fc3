package com.cg.inter;

public class Queue {
	private String data;
	private boolean flag;
	
	public synchronized void put(String str) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = str ;
		System.out.println("produced");
		notify();
	}
	
	public synchronized void get() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("consumed  "+ data);
		notify();
	}

}
