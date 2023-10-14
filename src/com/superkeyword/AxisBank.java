package com.superkeyword;

public class AxisBank extends Bank {

	public AxisBank() {
		//super();
		System.out.println("AxisBank object created");
	}
 String bank_name="AxisBank";
  void getBankName() {
	System.out.println(bank_name);// axisbank class
	System.out.println(super.bank_name);//access varible of Bank class i.e parent of AxisBank class.

}
  void deposit(){
		 System.out.println("deposit of AxisBank class");
	 }
  void credit(){
	  System.out.println("credit method of AxisBank");
  }
 
  void common(){
	  super.deposit();
	  credit();
  }
  
  public static void main(String[] args) {
	AxisBank axisBank= new AxisBank();
	axisBank.getBankName();
	axisBank.common();
}
}
