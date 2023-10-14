package com.oops.polymorphism;

public class MethodHidingDemo {
 public static void main(String[] args) {
	 Parent p=new Parent();
	 p.m1();//parent class
	 Child c=new Child();
	 c.m1();//child class
	 Parent p1=new Child();
	 p1.m1();//parent class
	 p1.m2();
} 
}
