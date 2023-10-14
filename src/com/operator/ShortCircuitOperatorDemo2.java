package com.operator;

public class ShortCircuitOperatorDemo2 {

	public static void main(String[] args) {
	 
	   int i=10;
	   if(++i<10 & i>=10){
		   System.out.println("hello");
	   }
	   else
		   System.out.println("hi");
	}
}
