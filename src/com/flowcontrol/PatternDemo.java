package com.flowcontrol;

import java.util.Scanner;

public class PatternDemo {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n:");
	int n=sc.nextInt();
	System.out.println("enter the symbol");
	char c=sc.next().charAt(0);
	//outer loop 1
	for(int i=1;i<=n;i++){
		//inner loop 1 for white spaces;
	    for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		//inner loop 2
		for(int j=1;j<=i*2-1;j++){
			System.out.print(c);
		}
		
		System.out.println();
	}
	//end first outer for loop
		for(int i=n-1;i>0;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	
}
}
