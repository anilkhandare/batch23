package com.operator;

public class RelationalOperator {
 public static void main(String[] args) {
	System.out.println(10>10.5);
	System.out.println('a'>95.5);
	System.out.println('z'>'a');
	int c='z';
	System.out.println(c);
	//System.out.println(true>false);//expect boolean
	RelationalOperator r= new RelationalOperator();
	RelationalOperator r1= new RelationalOperator();
	
	//System.out.println(r>r1); // we cant use it for object type
	//System.out.println("anil">"anil");
	//System.out.println(10>10>30);//we cant use it for nesting
	
	
	
	
}
}
