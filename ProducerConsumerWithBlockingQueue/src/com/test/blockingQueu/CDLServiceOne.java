package com.test.blockingQueu;

import java.util.concurrent.CountDownLatch;

public class CDLServiceOne implements Runnable{
	
	 private final CountDownLatch latch;
	 
	 public CDLServiceOne(CountDownLatch latch){
		 this.latch=latch;
	 }
	 
	 @Override
	    public void run() {
	        System.out.println("Started service One");
	        latch.countDown();
	        System.out.println("First CDL is done"); 
	    }
	 

}
