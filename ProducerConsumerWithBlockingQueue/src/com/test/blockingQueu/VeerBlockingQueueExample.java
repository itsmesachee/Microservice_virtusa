package com.test.blockingQueu;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class VeerBlockingQueueExample {
	
  public void retriveData(BlockingQueue queue) {
	  Thread consumer = new Thread(new BQConsumer(queue));
	  consumer.start();
  }	
	
  public static void main(String[] arg) {
	  BlockingQueue queue = new ArrayBlockingQueue(1024);
	  VeerBlockingQueueExample vec = new VeerBlockingQueueExample();
	  Thread producer = new Thread(new BQProducer(queue));
	
	  producer.start();
	 
	  try {
	  System.out.println("First fetch");	  
	   vec.retriveData(queue);
	  Thread.sleep(150);
	  System.out.println("Second fetch");
	  vec.retriveData(queue);
	  Thread.sleep(150);
	  System.out.println("Third fetch");
	  vec.retriveData(queue);
	  
	  
	  
	  } catch(Exception exp) {
		  exp.printStackTrace();
	  }
  }
}
