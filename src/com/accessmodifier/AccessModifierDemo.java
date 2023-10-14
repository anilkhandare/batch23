package com.accessmodifier;

public class AccessModifierDemo {
  private int i=10;
  private void test(){
	  System.out.println("test");
	  
  }
public int getI() {
	System.out.println(i);
	return i;
}
public void setI(int i) {
	this.i = i;
}
  
  
}
