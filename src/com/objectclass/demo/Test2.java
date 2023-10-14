package com.objectclass.demo;

public class Test2 {
 int id;
 Test2(int id){
	 this.id=id;
 }
 public static void main(String[] args) {
	Test2 t2=new Test2(100);
	Test2 t3=new Test2(100);
	System.out.println(t2);
	System.out.println(t3);
	
	
}
}
