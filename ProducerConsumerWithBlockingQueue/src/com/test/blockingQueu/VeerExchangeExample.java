package com.test.blockingQueu;

import java.util.concurrent.Exchanger;

public class VeerExchangeExample {
  public static void main(String[] arg) {
	  try {
		  Exchanger exchanger = new Exchanger();
		  ExchangerService exService1 = new ExchangerService(exchanger,"aaa");
		  ExchangerService exService2 = new ExchangerService(exchanger,"bbb");
		  ExchangerService exService3 = new ExchangerService(exchanger,"ccc");
		  
		  Thread threadOne = new Thread(exService1);
		  threadOne.setName(" ThreadOne");
		  Thread.sleep(100);
		  Thread threadTwo = new Thread(exService2);
		  threadTwo.setName(" ThreadTwo");
		  Thread.sleep(100);
		  Thread thread3 = new Thread(exService3);
		  thread3.setName(" ThreadThree");
		  threadOne.start();
		  threadTwo.start();
		  thread3.start();
		  
	  }catch(Exception exp) {
		  exp.printStackTrace();
	  }
  }
}
