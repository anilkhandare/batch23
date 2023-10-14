package com.oops.polymorphism;

public interface ProductService {
	public String listAllProduct();

	public String listAllProduct(String bbn);

	public String listAllProduct(String bbn, String colour);

	public String listAllProduct(String bbn, String colour, double price);
}
