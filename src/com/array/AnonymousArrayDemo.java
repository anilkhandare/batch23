package com.array;

public class AnonymousArrayDemo {
	
	static void anonymousarray(int[][] a){
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		
	}
	public static void main(String[] args) {
		int a[]= new int[2];
		a[0]=1;
		a[1]=2;
		
		//anonymousarray(a);
		
		anonymousarray(new int[][]{{1,2,3},{10,20,30}});
		
	} 
	

}
