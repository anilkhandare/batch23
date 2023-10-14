package com.tightcoupling;

public class A {
	B b;
	 public A(){
		 b=new B();
	 }
	 public void show(){
		 System.out.println("A");
		 b.show();
	 }
}