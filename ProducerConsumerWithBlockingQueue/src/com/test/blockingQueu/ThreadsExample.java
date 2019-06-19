package com.test.blockingQueu;

public class ThreadsExample extends Thread{

	
		public  void run() {
			
		for(int i = 0;i<11;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1:"+i);
			
		}
		
		
		  for(int i1 = 0;i1<11;i1++) {
			  System.out.println("t2:"+i1);
		 
		  }
		 
		}
		public static void main(String[] args)  {
			
			ThreadsExample t = new ThreadsExample();
			//ThreadsExample t2 = new ThreadsExample();
			t.start();
			//t2.start();
			
		}


}
