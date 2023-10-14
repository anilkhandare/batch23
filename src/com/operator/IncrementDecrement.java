package com.operator;

public class IncrementDecrement {
 public static void main(String[] args) {
	int qty =2;
	int qty1=++qty;
	System.out.println("value of qty:"+qty);
	int x=4;
	//int y=++4;//invlid or unexpected type required : variable
	//int y=++(++x);//nesting of increment or decrement operator is not allowed
	final int i=8;
	//int y=++i; we cant  apply increment and decrement operator  for final variable
	
	char ch='a';
	ch++;
	System.out.println(ch);
	ch++;
	System.out.println(ch);
	double d=10.0;
	d++;
	System.out.println(d);
	boolean b=true;
	//b++; we cant apply increment or decrement operator for boolean 
	//max(int,typeof a , typeof b)
	byte a=10;
	a--;
	//byte b1=20;
	//byte c=a+b1;
	System.out.println(a);
	
}
}
