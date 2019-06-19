package com.test.blockingQueu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		
		int noOfproducer = 4;
		int noOfConsumer = 3;
		
		BlockingQueue<Object> bq= new LinkedBlockingQueue<>(20);
		
		Thread.sleep(1000);
		for(int i=0;i< noOfproducer;i++) {
			new Thread(new Producer(bq)).start();
		}
		
		for(int i=0;i< noOfConsumer;i++) {
			new Thread(new Consumer(bq)).start();
		}
       Thread.sleep(10*1000);
       System.exit(0);

	}

}
