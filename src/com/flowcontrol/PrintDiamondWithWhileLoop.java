package com.flowcontrol;

import java.util.Scanner;

public class PrintDiamondWithWhileLoop {
 public static void main(String[] args) {
	    //Scanner sc=new Scanner(System.in);
		//System.out.println("numbers:");
		int n=10;
		//System.out.println("symbol");
		char c='1';
		int i=1;
		int j;
		
		while(i<=n){
		  	j=1;
		  	while(j++<=n-i){
		  		System.out.print(" ");
		  	}
		  	j=1;
		  	while(j++<=i*2-1){
		  		System.out.print(c);
		  	}
		  	System.out.println();
		  	i++;
		}
		i=n-1;
		while(i>0){
		 	j=1;
		  	while(j++<=n-i){
		  		System.out.print(" ");
		  	}
		  	j=1;
		  	while(j++<=i*2-1){
		  		System.out.print(c);
		  	}
		  	System.out.println();
			
			
			
			i--;
		}
	 
}
}
