package com.constructor;

public class CustomerModel{
  int custid;
  String cname;
  String caddress;
  public String getPan() {
	return pan;
}
public void setPan(String pan) {
	this.pan = pan;
}
public String getAdhhar() {
	return adhhar;
}
public void setAdhhar(String adhhar) {
	this.adhhar = adhhar;
}
String pan;
  String adhhar;
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	this.caddress = caddress;
}

@Override
public String toString() {
	return "CustomerModel [custid=" + custid + ", cname=" + cname + ", caddress=" + caddress + ", pan=" + pan
			+ ", adhhar=" + adhhar + "]";
}
public CustomerModel(int custid, String cname, String caddress) {
	super();
	this.custid = custid;
	this.cname = cname;
	this.caddress = caddress;
}
public CustomerModel(String pan, String adhhar) {

	this.pan = pan;
	this.adhhar = adhhar;
}

public CustomerModel(CustomerModel cm){
	pan=cm.pan;
	adhhar=cm.adhhar;
}

public CustomerModel(int custid, String cname, String caddress, String pan, String adhhar) {
	super();
	this.custid = custid;
	this.cname = cname;
	this.caddress = caddress;
	this.pan = pan;
	this.adhhar = adhhar;
}
public CustomerModel() {
	
}

  


}
