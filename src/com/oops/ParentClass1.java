package com.oops;

public interface ParentClass1 {
	int i=0;
	void home();//Illegal modifier for the interface method home; only public, abstract, default, static and strictfp are permitted
    static void home2(){
    	System.out.println("this is static method of parentclass 1");
    }
    default void home3() {
    	System.out.println("this is default method of  parentclass 1");
	}
   /* public void test(){
    	
    }*/
}
