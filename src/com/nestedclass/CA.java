package com.nestedclass;

public class CA {
	static int i=10;
	
   static class AC{
	   void show(){
		    System.out.println(i);
	   }
   }
   class AC2{
	   void show2(){
		    System.out.println(i);
	   }
   }
   
   public static void main(String[] args) {
	CA.AC ac=new CA.AC();
	ac.show();
	AC ac1=new AC();
	ac1.show();
	//outer class object
	CA ca=new CA();
	//encloased innner nonstatic class object with outer class object
	CA.AC2 ac2 = ca.new AC2();

	
	ac2.show2();

}
}
