package com.oops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BankMainClass {
 public static void main(String[] args) {
	Bank bank=new Bank();
	System.out.println("---------record1----------------------------------");
	bank.setBankid(1);
	bank.setBank_name("axis");
	bank.setBank_code("axis4545");
	bank.setBank_address("hadapsar");
	int bankid1=bank.getBankid();
	String bname1=bank.getBank_name();
	String bankcode1=bank.getBank_code();
	String bank_add1=bank.getBank_address();
	System.out.println(bankid1);
	System.out.println(bname1);
	System.out.println(bankcode1);
	System.out.println(bank_add1);
	System.out.println("---------record2----------------------------------");

	bank.setBankid(2);
	bank.setBank_name("sbi");
	bank.setBank_code("sbi4020");
	bank.setBank_address("baner");
	int bankid2=bank.getBankid();
	String bname2=bank.getBank_name();
	String bankcode2=bank.getBank_code();
	String bank_add2=bank.getBank_address();
	System.out.println(bankid2);

	System.out.println(bname2);
	System.out.println(bankcode2);
	System.out.println(bank_add2);
}
}
