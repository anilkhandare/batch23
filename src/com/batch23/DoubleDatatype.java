package com.batch23;

public class DoubleDatatype {
 double d1=1;
 double d2=2.11;
 double d3=282828;
 double d4='A';
 double d5='b';
 //double d6="Anil";//Type mismatch: cannot convert from String to double
 //double d7=true;//Type mismatch: cannot convert from boolean to double
 public static void main(String[] args) {
	DoubleDatatype d= new DoubleDatatype();
	System.out.println(d.d4);
	System.out.println(d.d5);
}
}
