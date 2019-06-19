package com.test.blockingQueu;

import java.util.concurrent.CountDownLatch;

public class CDLServiceTwo implements Runnable{
	private final CountDownLatch latch;
	
	public CDLServiceTwo(CountDownLatch latch) {
		this.latch=latch;
	}
	
	public void run() {
		 System.out.println("Started service Two");
		latch.countDown();
		System.out.println("Second CDL is done");
	}
}
