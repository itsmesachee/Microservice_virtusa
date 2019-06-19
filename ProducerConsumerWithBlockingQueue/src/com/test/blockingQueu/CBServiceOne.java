package com.test.blockingQueu;

import java.util.concurrent.CyclicBarrier;

public class CBServiceOne implements Runnable {
	
	private CyclicBarrier cycBarrier;
	
	public CBServiceOne(CyclicBarrier cb) {
		cycBarrier = cb;
	}
	
	public void run() {
		System.out.println("CBServiceOne started....");
		try {
		System.out.println("CBService one is going to be sleep");
		Thread.sleep(1000);
		System.out.println("CBService one is waked up");
		cycBarrier.await();
		System.out.println("CBServiceOne is done");
		} catch(Exception exp) {
			exp.printStackTrace();
		}
	}

}
