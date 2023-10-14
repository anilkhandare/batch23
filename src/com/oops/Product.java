package com.oops;

public class Product {
	
	 int id;
	 String productname;
	private double productprice;
	
	public double getPrice(int id){
		if(this.id==id){
			return productprice;
		}
		return -1;
		
	}
	
	public void setPrice(double price,int id){
		if(this.id==id){
			productprice=productprice+price;
		}
	}
	

}
