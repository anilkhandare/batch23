package com.accessmodifier;

public class Child2 extends AccessModifierDemo2{

	/*public void test(){
		System.out.println("test of child2");
	}*/
	public static void main(String[] args) {
		Child2 c=new Child2();
		c.test();
	
		AccessModifierDemo2 acm = new Child2();
	   acm.test();
	   AccessModifierDemo4 acm4= new AccessModifierDemo4();
	   acm4.test();
	}
}
