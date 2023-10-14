package com.nestedclass;

public class CA2 {
  
	int i;
	static int j;
	
	class AC2{
	  void m1(){
		  System.out.println("hadfhasdfhl");
	  }
  }
 public static void main(String[] args) {
	
	 CA2 ca2= new CA2();
	 ca2.new AC2().m1();;
	 
	
}
}
