package com.test.blockingQueu;

import java.util.concurrent.CountDownLatch;

public class VeerCoundDownLatchExample {
  public static void main(String[] arg) {
	  CountDownLatch countDown = new CountDownLatch(2);
	  Thread serviceOne = new Thread(new CDLServiceOne(countDown));
	  Thread serviceTwo = new Thread(new CDLServiceTwo(countDown));
	  serviceOne.start();
	  serviceTwo.start();
	  
	  	  
	  try {
		  System.out.println("Before await of CDLs");
		  countDown.await();
		  
		    System.out.println("After await of CDLs");
		    System.out.println("getCount ::"+countDown.getCount());
	  }catch(Exception exp) {
		  exp.printStackTrace();
	  }
  } 
}
