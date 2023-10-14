package com.gc;

public class GCDemo {
public void	finalize(){
		System.out.println("cleanup process done");
	}

  public static void main(String[] args) {
	/*Customer customer=null;
	Customer customer2=new Customer();
	Customer customer3=new Customer();
	customer2=customer3;*/
	new GCDemo();
	GCDemo gc=new GCDemo();
	GCDemo gc2=new GCDemo();
	gc=null;
	gc2=gc;
	System.gc();
	
}
}
