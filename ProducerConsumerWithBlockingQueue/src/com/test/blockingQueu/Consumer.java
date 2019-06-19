package com.test.blockingQueu;

import java.util.concurrent.BlockingQueue;

public class Consumer  implements Runnable{
    BlockingQueue<Object>  bQueue;
    
	Consumer(BlockingQueue<Object>  bQueue){
		this.bQueue = bQueue;
				
	}
	
	@Override
	public void run() {

		try {
			Object obj1 = bQueue.take();
			System.out.println("Consumed resource - Queue size now :"  +bQueue.size());
			take(obj1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	void take( Object obj){
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			System.out.println(" Consumer Read Interrupted.");
		}
	
		System.out.println("consuming Object "+obj);
	}

}
