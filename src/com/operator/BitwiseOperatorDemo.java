package com.operator;

public class BitwiseOperatorDemo {
 public static void main(String[] args) {
	System.out.println(true&false);
	System.out.println(true&true);
	int a = 20,b = 19;
	System.out.println("before the OR ");
	if(a==20 | b==30){
		System.out.println("or operator one value matching done ");
	}
	int i=10;
	int j=10;
	System.out.println(i&j);
	if(i==10 & j==20){
		System.out.println("both values are equals");
	}
	System.out.println("before the X-OR ");

	System.out.println(20^30);
	System.out.println(true^false);
	System.out.println(true^true);
	int k=10,m=10;
	System.out.println(k^m); 
	//System.out.println(~true);
	System.out.println(~4);
	System.out.println(!false);
	//System.out.println(!20);
	
}
}
