package com.test.blockingQueu;

import java.util.concurrent.BlockingQueue;

public class BQConsumer implements Runnable {
	
	private BlockingQueue queue;
    
	public BQConsumer(BlockingQueue que) {
		queue = que;
	}
	
	public void run() {
		try {
			
		while(!queue.isEmpty()) {
		System.out.println(queue.take());
		}
		} catch(Exception exp) {
			exp.printStackTrace();
		}
	}
}
