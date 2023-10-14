package com.oops.polymorphism;

public class RuntimePolyDemo {
 public static void main(String[] args) {
	 AxisBank ax1,ax2,ax3,ax4;
	 ax1=new AxisBank();
	 ax2=new Branch1();
	 ax3=new SubBranch1();
	 ax4=new SubBranch2();
	 ax1.deposit();
	 ax2.deposit();
	 ax3.deposit();
	 ax4.deposit();
	 ax1.deposit(10);
	 ax2.deposit(10);
	 ax3.deposit(10);
	 ax4.deposit(0);
	 ax2.withdrawal();
	 
	 
}
}
