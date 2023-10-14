package com.batch23;

public class NonPrimitiveDatatype {

	 int i=10;//numbers
	 int j=20;
	 int k;
	 public void add(){
		 int k=i+j;
		 System.out.println(k);
	 }
	 public static void main(String[] args) {
		 NonPrimitiveDatatype nonp= new NonPrimitiveDatatype();
		 nonp.add();
	}
}
