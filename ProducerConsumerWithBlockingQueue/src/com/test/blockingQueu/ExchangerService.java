package com.test.blockingQueu;

import java.util.concurrent.Exchanger;

public class ExchangerService implements Runnable{

	private Exchanger exchanger;
	private Object data;
	
	public ExchangerService(Exchanger ex, Object obj) {
		this.exchanger = ex;
		this.data = obj;
	}
	
  public void run(){
	  try {
		  Object existing = this.data;  
	   this.data = this.data+ Thread.currentThread().getName();  
	  
	  this.data = this.exchanger.exchange(this.data);
	  System.out.println(Thread.currentThread().getName()+"::"+ "Before exchange ::" + existing +"::After exchange::"+ this.data);
	  } catch(Exception exp) {
		  exp.printStackTrace();
	  }
	  
  }	
}
