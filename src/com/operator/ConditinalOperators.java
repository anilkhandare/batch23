package com.operator;

public class ConditinalOperators {
   @SuppressWarnings("unused")
public static void main(String[] args) {
	int x=(10>20)?30:40;
	System.out.println(x);
	String s;
	int i=6,j=6;
	s= i==j ? "Yes":"No";
	System.out.println(s);
	
	int y=(10>20)?30:((100>10)?40:50);
	System.out.println(y);
	
	int y1=(10>20)?30:((100<10)?40:50);
	System.out.println(y1);
	final int a=10;
	final int b=20;

		
	byte b1=(10>20)?30:40;
	System.out.println(b1);
	byte b2=(30<20)?30:40;
	System.out.println(b2);
	//byte b3=(a>b)?30:40;
	//byte b4=(a<b)?30:40;
	//System.out.println(b3);
	//System.out.println(b4);
	
}
}
