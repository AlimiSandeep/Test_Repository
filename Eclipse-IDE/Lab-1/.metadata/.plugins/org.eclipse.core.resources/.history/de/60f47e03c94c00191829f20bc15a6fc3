
package com.cg.sync2;

public class Hello {
	public synchronized void sayHello() {
		System.out.println("hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
