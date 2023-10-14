package com.statickeyword;

public class StaticBlock {
 
	static {
	System.out.println("calling static block"); 
	
 }
	{
		System.out.println("simple block");
	}

 public static void main(String[] args) {
	System.out.println("calling main method");
   StaticBlock stb=new StaticBlock();
   
 }
 
 
}
