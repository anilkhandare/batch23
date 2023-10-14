package com.oops;

public class Account implements Cloneable {
	int id;
	double bal;
	
	void saveRecord(int i,double balance){
		id=i;
		bal=balance;
	}
	void getRecords(){
		System.out.println(id+ "----"+bal);
	}
	public Account(int id,double bal) {
		// TODO Auto-generated constructor stub
		this.bal=bal;
		this.id=id;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
