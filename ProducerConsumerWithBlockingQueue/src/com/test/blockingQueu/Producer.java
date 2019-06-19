package com.test.blockingQueu;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<Object> blockingQueue;
	
		
	Producer(BlockingQueue<Object> blockingQueue){
		
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				Object obj = getResource();
				
				blockingQueue.put(obj);
				System.out.println("object is put and Now Queue SIZE is::"+blockingQueue.size());
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		
		Object getResource(){
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("inside Resource () Catch block: PRODUCER Read Interrupted.");
			}
			return new Object();
		}
		
	

}
