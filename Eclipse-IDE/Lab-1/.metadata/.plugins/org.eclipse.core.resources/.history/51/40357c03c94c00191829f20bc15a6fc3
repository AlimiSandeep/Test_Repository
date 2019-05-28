package com.cg.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SpoolDemo {
public static void main(String[] args) {
	CricketTask task=new CricketTask();
	ScheduledExecutorService pool=Executors.newScheduledThreadPool(1);
	pool.scheduleAtFixedRate(task, 5, 2, TimeUnit.SECONDS);
}
}
