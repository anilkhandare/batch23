package com.oops;

public class B extends A implements ParentClass1{
  public void methodB(){
	  System.out.println("methodB");
  }
  public void methodB1(){
	  System.out.println("methodB");
  }
  public void common(){
	  System.out.println("common method of b class");
  }
  public static void main(String[] args) {
	  A a1 = new B();//upcasting
	 ParentClass1 reParentClass1=new B();
	 A a= new A();
	 a.common();
	 a.methodA();
	 a.methodA1();
	 a1.common();
	 
	 
}
@Override
public void home() {
	// TODO Auto-generated method stub
	
}
}
