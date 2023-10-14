package com.objectclass.demo;

public class WaitMethodDemo  extends Thread {
  int id=10;
  synchronized public void test( int j){
	    
	   for(int i=0;i<=5;i++){
	    	System.out.println("hie hello");
	    
	    		System.out.println(j);
	    	System.out.println("calling wait method");
	    		try{
	    	wait(100);
	    	}catch(Exception ae){
	    		ae.printStackTrace();
	    	}
	    
	   }
	    System.out.println("bye");
   }
   public static void main(String[] args) throws InterruptedException {
	WaitMethodDemo waitMethodDemo= new WaitMethodDemo();
    new Thread(){
    	@Override
    	public void run(){
    		waitMethodDemo.test(0);
    	}
    }.start();
	//waitMethodDemo.run();
}
}
