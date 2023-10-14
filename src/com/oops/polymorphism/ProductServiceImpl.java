package com.oops.polymorphism;

public class ProductServiceImpl implements ProductService {

	@Override
	public String listAllProduct() {
		// TODO Auto-generated method stub
		System.out.println("list all product");
		return "list Product";
	}

	@Override
	public String listAllProduct(String bbn) {
		// TODO Auto-generated method stub
		System.out.println(bbn);
		return "String bbn";
	}

	@Override
	public String listAllProduct(String bbn, String colour) {
		// TODO Auto-generated method stub
		System.out.println(bbn+" "+colour);
		return "String bbn, String colour";
	}

	@Override
	public String listAllProduct(String bbn, String colour, double price) {
		// TODO Auto-generated method stub
		System.out.println(bbn+"  "+colour+"  "+price);
		return "String bbn, String colour, double price";
	}
	public static void main(String[] args) {
		ProductServiceImpl impl= new ProductServiceImpl();
		impl.listAllProduct();
		impl.listAllProduct("doctor");
		impl.listAllProduct("doctor", "red");
		impl.listAllProduct("doctor", "red", 100);
	}

}
