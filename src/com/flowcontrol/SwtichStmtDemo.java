package com.flowcontrol;

public class SwtichStmtDemo {
	public static void main(String[] args) {
	final int i=10;
	final int j=20;
	switch(i){
	case i:
	System.out.println(i);
	
	case j:
		System.out.println("20");
	}
	switch(i+1){
	case 11:
		System.out.println(i);
	case 20+10:
		System.out.println("case 20+10");
	case 10+20+30:
		System.out.println("case 10+20+30");
	}
	
	//every case lebel should be within the range of switch argument
byte b=10;
	switch(b){
	case 10:
		System.out.println("case 10");
	case 100:
		System.out.println("case 100");
	//case 1000:
		System.out.println("case 1000");
	//case 100:// duplicate case is not allowed 
	}
	
	switch(b){
	case 97:
		System.out.println("97");
	case 99:
		System.out.println("99");
	//case 'a':Duplicate case
	}
//fall through inside the switch:
	int i1=0;
switch(i1){

case 0:
	System.out.println("0");
	break;
case 1:
	System.out.println("1");
	break;
default:
	System.out.println("default");
case 2:
	System.out.println("2");
	break;

}
}
}
