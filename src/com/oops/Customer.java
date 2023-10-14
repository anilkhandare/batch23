package com.oops;

public class Customer  {
  int id;
  String name;
  Address address;
  Account1 account;
public Customer(int id, String name, Address address, Account1 account) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.account = account;
}
 public void list(){
	 System.out.println("ID:"+id+" "+name);
	 System.out.println(address.city+""+address.pincode);
	 System.out.println("accountNumber:"+account.account);
 }
 public static void main(String[] args) {
	Address addres1=new Address("pune", "MH", "411028");
	Address addres2=new Address("mumbai", "MH", "411045");
	Account1 ac=new Account1("51548512");
	Account1 ac1=new Account1("8455455");
	Customer c=new Customer(1, "anil", addres1, ac);
	Customer c2=new Customer(2, "suraj", addres2, ac1);
	c.list();
	c2.list();
}

}
