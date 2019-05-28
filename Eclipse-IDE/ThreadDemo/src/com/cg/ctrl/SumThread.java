package com.cg.ctrl;

public class SumThread extends Thread {

	@Override
	public void run() {
		double sum=0;
		for(int i=1;i<=10000;i++)
			sum=sum+i*i;
		SleepMain.sum=sum;
	}

}
