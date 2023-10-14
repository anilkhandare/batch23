package com.flowcontrol;

public class WhileLoopDemo5 {
 public static void main(String[] args) {
	int a=10,b=20;
	while(a<b){
		System.out.println("hi");
		break;
	}
	System.out.println("hello");
	int i=0;
	
	while (i<=10) {
		System.out.println(i);
		i++;
		
	}
	int j=1;
	do{
		System.out.println("in the do block:");
		j++;
	}while(j<=5);
}
}
