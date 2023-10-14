package com.objectclass.demo;

public class Product2 {
 int pid;
 String pname;
 String pcat;
public Product2(int pid, String pname, String pcat) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pcat = pcat;
}
/*@Override
public String toString() {
	return "Product [pname=" + pname + ", pcat=" + pcat + "]";
}*/
/*public String toString(){
	return getClass().getName()+"@"+Integer.toHexString(hashCode());
	
}*/
/*public int hashCode(){
	return pid;
}*/
 
}
