package com.cg.pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int start;
	private int end;
	

	public MyCallable(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=start;i<=end;i++)
			sum+=i;
		return sum;
	}

}
