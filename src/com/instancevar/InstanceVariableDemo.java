package com.instancevar;

public class InstanceVariableDemo {
	int i=10;
	
   public static void main(String[] args) {
	Product product= new Product();
	Product product1= new Product();
	Product product2= new Product();
	System.out.println(product.id);
	System.out.println(product.productName);
	System.out.println(product1.id);
	System.out.println(product2.id);
	InstanceVariableDemo instanceVariableDemo= new InstanceVariableDemo();
	System.out.println(instanceVariableDemo.i);

	
}
}
