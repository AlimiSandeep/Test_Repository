package com.cg.sync;

public class AccountClient {
public static void main(String[] args) {
	Account acc=new Account();
	RamThread t1=new RamThread(acc);
	t1.setName("Ram");
	TomThread t2=new TomThread(acc);
	t2.setName("Tom");
	
	t1.start();
	t2.start();
}
}

