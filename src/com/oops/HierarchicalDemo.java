package com.oops;

public class HierarchicalDemo {
  public static void main(String[] args) {
	PermanentEmployee pm=new PermanentEmployee();
	ContractEmployee ce=new ContractEmployee();
	System.out.println("pm sal:"+pm.salary);
	System.out.println("hike:"+pm.hike);
	System.out.println("ce sal:"+ce.salary);
	System.out.println(ce.hike);
}
}
