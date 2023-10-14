package com.flowcontrol;

public class SwitchDemo2 {
 public static void main(String[] args) {
	Bank b=Bank.BankOfMaharashtra;
	  switch (b) {
	case Axis:
		System.out.println("this is axis bank");
		break;
	case SBI:
		System.out.println("SBI");
		break;
	case BankOfMaharashtra:
	 System.out.println("BankOfMaharashtra");
	 break;
	case ICICI:
		System.out.println("ICICI");
		break;

	default:
		break;
	}
}
}
