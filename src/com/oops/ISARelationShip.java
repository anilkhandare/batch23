package com.oops;

public class ISARelationShip {
   public static void main(String[] args) {
	 Parent p= new Parent();
	 //p.methodOne();
	// p.methodTwo();//The method methodTwo() is undefined for the type Parent
	 Child c=new Child();
	// c.methodOne();
	 c.methodTwo();
	 Parent p1=new Child();///
	// p1.methodOne();
	 //p1.methodTwo();
	// Child ch=new Parent();//
	 
	 HomeLoan homeLoan=new HomeLoan();
	 homeLoan.loan();
	 EducationalLoan educationalLoan= new EducationalLoan();
	 educationalLoan.loan();
	 
	 
	 
}
}
