package com.objectclass.demo;

public class CloneMethodDemo implements Cloneable{
	int i=10;
	int j=10;
	public static void main(String[] args) throws Exception {
		CloneMethodDemo	c=new CloneMethodDemo();
		CloneMethodDemo	c1=(CloneMethodDemo) c.clone();
		System.out.println(c==c1);
		System.out.println(c.hashCode()==c1.hashCode());
		
		c.i=20;
		c.j=30;
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c1.i);
		System.out.println(c1.j);
		
		A a= new A(10);
		B b= new B(20);
		B b1= b;
		A a1=a;
		System.out.println(a==a1);
		System.out.println(a.hashCode()==a1.hashCode());
		System.out.println(b1.i);
		System.out.println(a1.j);
	
	
		
		
		
	}

}
