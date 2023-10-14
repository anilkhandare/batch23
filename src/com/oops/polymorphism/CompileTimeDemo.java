package com.oops.polymorphism;

public class CompileTimeDemo {
 final void test(){
	System.out.println("test()"); 
 }
void test(int i){
	System.out.println("test(int i)"); 
 }
int test(float i){
	System.out.println("test(int i , int j)");
	return 0; 
}
void test(float i,int f){
	System.out.println("test(int i , int j)"); 
}
public static void main(String[] args) {
	CompileTimeDemo c= new CompileTimeDemo();
	c.test();
	c.test(2);
	c.test(1, 0);
}
}
