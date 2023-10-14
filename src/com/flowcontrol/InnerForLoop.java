package com.flowcontrol;

public class InnerForLoop {
  public static void main(String[] args) {
	for(int i=0;i<10;i++){
		System.out.println("outer loop");
		for(int j=0;j<=i;j++){
			System.out.println("inner loop");
		}
	}
}
}
