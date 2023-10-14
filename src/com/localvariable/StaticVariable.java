package com.localvariable;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class StaticVariable {
 public static void main(String[] args) {
	 BankCustomer bankCustomer1= new BankCustomer(1, "harshda", 2100, 1010101.0f);
	 BankCustomer bankCustomer2= new BankCustomer(2, "gajanan", 4400, 1010101.0f);
	 BankCustomer bankCustomer3= new BankCustomer(3, "yash", 5000, 1010101.0f);
	 BankCustomer bankCustomer4= new BankCustomer(4, "mahesh", 5000, 1010101.0f);
	 System.out.println(bankCustomer1.toString());
	 bankCustomer1.getCustomerList();
	 bankCustomer2.getCustomerList();
	 bankCustomer3.getCustomerList();
	 bankCustomer4.getCustomerList();
	 BankCustomer.bank="SBI";
	 bankCustomer1.getCustomerList();
	 bankCustomer2.getCustomerList();
	 bankCustomer3.getCustomerList();
	 bankCustomer4.getCustomerList();
	 System.out.println(bankCustomer1.totalbal);
}
}
