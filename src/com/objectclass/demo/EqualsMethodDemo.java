package com.objectclass.demo;

public class EqualsMethodDemo {
 
	
	public static void main(String[] args) {
	 Product p= new Product(1, "samsung", "mobile");
	 Product p1= new Product(1, "samsung", "mobile");
	 

	 System.out.println(p);
	 System.out.println(p1);
	 System.out.println(p.equals(p1));
	System.out.println(p.equals("samsung"));
	System.out.println(p.equals(null));
	
	 
	 
}
}
