package com.oops;

public class RuntimePolyDemo {
   public static void main(String[] args) {
	   Bank b;
	   b=new BankOfMH();
	   System.out.println("rate of intrest of bank of MH:"+b.rateOfIntrest());
	   b=new AxisBank();
	   System.out.println("interest rate of axis bank:"+b.rateOfIntrest());
	   System.out.println("bankid:"+b.bankid);
	  
}
}
