package com.oops.polymorphism;

public class Branch1 extends AxisBank{
	public float deposit(){
		 System.out.println("deposit branch1");
		return 0;
	 }
	void deposit(int i){
		 System.out.println("deposit branch1 deposit(int i)");
	 }
	static void withdrawal(){
		 System.out.println("this is bracnh1 static void withdrawal method:");
	 }
	
}
