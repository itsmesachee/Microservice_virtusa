package com.test.blockingQueu;

import java.util.concurrent.CyclicBarrier;

public class VeerCyclicBarrierExample {
	
	public static void main(String[] arg) {
		CyclicBarrier cb = new CyclicBarrier(3);
		Thread serviceOne = new Thread(new CBServiceOne(cb));
		Thread serviceTwo = new Thread(new CBServiceTwo(cb));
		serviceOne.start();
		serviceTwo.start();
		System.out.println("Before CBWait");
		try {
			cb.await();
		  System.out.println("Main CB is done");
		  
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		System.out.println("After CBWait");
	}

}
