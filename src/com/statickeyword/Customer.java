package com.statickeyword;

public class Customer {
  int id;
  String name;
  static String bank="SBI";
  static String ifsc="SBI005488";
public Customer(int id, String name) {
	 
	this.id = id;
	this.name = name;
}
static void update(){
	//name="anil";//Cannot make a static reference to the non-static field name
	bank="Axis";
	//System.out.println(name);
	System.out.println(ifsc);
}
void showCustomerList(){
	//bank="axis";
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("bank:"+bank);
	System.out.println("ifsc:"+ifsc);
}
  
}
