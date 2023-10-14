package com.objectclass.demo;

public class Test3 {
	int id;
	 Test3(int id){
		 this.id=id;
	 }
	 public int hashCode(){
		 return id;
	 }
	 public String toString(){
		return id+"";
		 
	 }
	 public static void main(String[] args) {
		Test3 t2=new Test3(100);
		Test3 t3=new Test3(40);
		System.out.println(t2);
		System.out.println(t3);
		
		
	}
}
