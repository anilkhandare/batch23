package com.accessmodifier;

public class Child extends AccessModifierDemo{

	/*void test(){
		System.out.println("test of child");
	}*/
	public static void main(String[] args) {
		Child c=new Child();
		c.test();
		AccessModifierDemo acm = new AccessModifierDemo();
		acm.getI();
		AccessModifierDemo3 acm3= new AccessModifierDemo3();
	}
}
