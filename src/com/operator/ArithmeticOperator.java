package com.operator;

public class ArithmeticOperator {
   public static void main(String[] args) {
	System.out.println('a'+1);
	int a='a';
	System.out.println(a);
	
	System.out.println('a'+'b');
	int b='b';
	System.out.println(b);
	System.out.println(10+0.5);
	System.out.println('a'+3.5);
	System.out.println(-10/0.0);
	System.out.println(0.0/0);
	System.out.println(-0.0/0);
	System.out.println(0/0.0);
	int i=10;
	System.out.println(i>Float.NaN);
	System.out.println(i<Float.NaN);
	System.out.println(i>=Float.NaN);
	System.out.println(i<=Float.NaN);
	System.out.println(i!=Float.NaN);
	System.out.println(Float.NaN!=Float.NaN);
	String s="expertit";
	int e=10,c=20,d=30;
	System.out.println(e+c+d+s);//act like arithmetic addition
	System.out.println(s+e+c+d);//Concatenation
	System.out.println(e+c+s+d);
	System.out.println(e+s+c+d);
	//s=e+c+d;// compile time error 
	//e=s+c+d;//compile time error
	e=c+d;
	System.out.println(e);
	System.out.println(10-10);
	System.out.println(10*10);
	System.out.println(10%3);
	
}
   
}
