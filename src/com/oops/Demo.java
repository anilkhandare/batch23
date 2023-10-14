package com.oops;


	public class Demo{
	 
		public static void main(String[] args) throws CloneNotSupportedException {
			Account ac=new Account(4,100);
			Account abc=(Account)ac.clone();
			//System.out.println(ac.id);
			ac.id=1;
			ac.bal=1000;
			ac.bal=2000;
			System.out.println(ac.id+" === "+ac.bal);
			ac.saveRecord(2, 2000);
			ac.getRecords();
			ac.saveRecord(3, 3000);			
			ac.getRecords();
		}
	}