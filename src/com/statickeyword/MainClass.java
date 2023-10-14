package com.statickeyword;

public class MainClass {
  public static void main(String[] args) {
    Customer.update();
	Customer c1=new Customer(1, "subham");
	Customer c2=new Customer(2, "gajanann");
	Customer c3=new Customer(3, "harshda");
	c1.showCustomerList();
	c2.showCustomerList();
	c3.showCustomerList();
	System.out.println(Constant.clientKey);
	System.out.println(Constant.phonepeurl);
	System.out.println(Constant.port);
	System.out.println(Constant.pssword);
	System.out.println(Constant.user);
	System.out.println(Constant.redirecturl);

	
}
}
