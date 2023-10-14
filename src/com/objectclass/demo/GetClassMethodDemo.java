package com.objectclass.demo;

public class GetClassMethodDemo implements Cloneable {
  public static void main(String[] args) {
	 Object o= new String("xpertit");
	 Object o1 = new Object();
	 System.out.println("Runtime object type of o1 is:"+o1.getClass().getName());
	 System.out.println("Runtime object type of o is:"+o.getClass().getName());

	 
	 
	 
}
}
