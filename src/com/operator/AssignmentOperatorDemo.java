package com.operator;

public class AssignmentOperatorDemo {
 public static void main(String[] args) {
	int i=10;
	System.out.println(i);
	//int a=b=c=d=10;//can not find symbol
	int a,b,c,d;
	a=b=c=d=10;
	System.out.println(a+"==="+b+"====="+c+"======="+d);
	byte b1=10;
	b1=(byte)(b1+1);
	b1++;
	a+=b-=c*=d/=2;
	System.out.println(a+"==="+b+"====="+c+"======="+d);
   int x=10;
   int y=10;
   x+=y;
   
   //x=10+10;
   System.out.println(x);
   
   int z = 0;
   z+=10;
   z=z+10;
   
	
}
}
