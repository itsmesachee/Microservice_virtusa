package com.test.blockingQueu;

import java.util.concurrent.CyclicBarrier;

public class CBServiceTwo implements Runnable {
	private CyclicBarrier cycBarrier;
	
	public CBServiceTwo(CyclicBarrier cb) {
		cycBarrier = cb;
	}
	
	public void run() {
		System.out.println("CBServiceTwo started....");
		try {
		System.out.println("CBService two is going to be sleep");
		Thread.sleep(2000);
		System.out.println("CBService two is waked up");
		cycBarrier.await();
		System.out.println("CBServiceTwo is done");
		} catch(Exception exp) {
			exp.printStackTrace();
		}
	}
}
