package com.operator;

public class EqualityOperatorDemo {
 public static void main(String[] args) {
	System.out.println(100==100.0);
	System.out.println('a'==97.0);
	System.out.println(true==true);
	System.out.println(true==false);
	System.out.println('a'!='b');
	System.out.println(97==98);
	Thread t= new Thread();
	Thread t2= new Thread();
	System.out.println(t==t2);
	EqualityOperatorDemo e= new EqualityOperatorDemo();
	EqualityOperatorDemo e2= new EqualityOperatorDemo();
	System.out.println(e==e2);
	EqualityOperatorDemo e3=e;
	System.out.println(e==e3);
    System.out.println(t instanceof Thread);
    System.out.print(t instanceof Object);
    
    
}
}
