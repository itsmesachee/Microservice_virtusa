package com.test.blockingQueu;

import java.util.concurrent.BlockingQueue;

public class BQProducer implements Runnable{
	private BlockingQueue queue;
	
	public BQProducer(BlockingQueue queue) {
		this.queue = queue;
	}
	public void run() {
		try {
		queue.add("One");
		queue.add("Two");
		Thread.sleep(100);
		queue.add("Three");
		queue.add("Four");
		Thread.sleep(100);
		queue.add("Five");
		queue.add("Six");
		} catch(Exception exp) {
			exp.printStackTrace();
		}
	}
}
