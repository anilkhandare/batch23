package com.oops;

public class ProductMainClass {
 public static void main(String[] args) {
	 Product product=new Product();
	 product.id=1;
	 product.productname="iphone";
	 product.setPrice(1000, 1);
	 double cust_price=product.getPrice(1);
	 System.out.println("id:"+product.id);
	 System.out.println("productname:"+product.productname);
	 System.out.println(cust_price);
	 
}
}
