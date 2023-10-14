package com.localvariable;

public class BankCustomer {
	int id;
	String name;
	static String bank="Axis";
	int balance = 0;
	float totalbal;// instance variable
	
	public BankCustomer(int id, String name, int balance, float totalbal) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.totalbal = totalbal;
	}
	
   public void getCustomerList(){
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(bank);
	   System.out.println(balance);
	   System.out.println(totalbal);
   }
	public void credit(){
		String bank="ICICI";
		int creditedbal = 0;// local variable
		System.out.println(bank);
		
		totalbal=balance+creditedbal;
	}
	public void debit(){
		int debitbal=0;
		System.out.println(creditedbal);
		totalbal=balance-debitbal;
		System.out.println(balance);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public float getTotalbal() {
		return totalbal;
	}
	public void setTotalbal(float totalbal) {
		this.totalbal = totalbal;
	}
	@Override
	public String toString() {
		return "BankCustomer [id=" + id + ", name=" + name + ", balance=" + balance + ", totalbal=" + totalbal + "]";
	}
	

}
