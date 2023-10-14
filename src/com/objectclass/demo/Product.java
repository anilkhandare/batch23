package com.objectclass.demo;

public class Product {
 int pid;
 String pname;
 String pcat;
public Product(int pid, String pname, String pcat) {
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
  public boolean equals(Object obj){
	 
	  try{
	  String pname=this.pname;	  
	  int pid=this.pid;
	  Product p=(Product) obj;
	  String pname2=p.pname;
	  int pid2=p.pid;
	  if(pname.equals(pname2)&& pid==pid2){
		  return true;
	  }
	  else
	  return false;
	  }catch(ClassCastException ce){
		  return false;
	  }catch(NullPointerException ne){
		  return false;
	  }
  }
}
