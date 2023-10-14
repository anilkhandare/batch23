package com.constructor;

public class ConstructorDemo {
	int  id;
	String name;
	
/*   ConstructorDemo() {
	   id=8844;
     System.out.println("default contructor");
	}*/
   
  

  public ConstructorDemo(int id, String name) {

	this.id = id;
	this.name = name;
}
  public ConstructorDemo(int id, String name,String address) {

		this.id = id;
		this.name = name;
	}
void test(){
	System.out.println("test method");
}
void test2(){
	//test();
	this.test();
}


public static void main(String[] args) {
    
	
	ConstructorDemo constructorDemo=new ConstructorDemo(10,"anil");
	constructorDemo.test2();
    System.out.println("==========================================");
	System.out.println(constructorDemo.id);
	System.out.println(constructorDemo.name);
	CustomerModel customerModel=new CustomerModel("pan","84515452");
	
	customerModel.setCaddress("mumbai");
	System.out.println(customerModel.getCaddress());
	System.out.println(customerModel.adhhar);
	
	System.out.println("===================================copy contructor=======================================");
	CustomerModel customerModel2= new CustomerModel(customerModel);
	System.out.println(customerModel2.adhhar);
	System.out.println("===================================copy values without contructor=======================================");
	CustomerModel customerModel3= new CustomerModel();
	customerModel3.adhhar=customerModel2.adhhar;
	System.out.println(customerModel3.adhhar);
}
}
