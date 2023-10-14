package com.operator;

public class ShortCircuitOperatorDemo {

	public static void main(String[] args) {
		int i=10;
		int j=15;
		if(++i>10 || ++j<15){
			++i;
		}
		else
			++j;
	System.out.println(i+"======="+j);
	}
}
