package com.flowcontrol;

public class LadderIfDemo {
 public static void main (String[]args) {
	int minbalsavingac=10000;
	int minbalcurrentac=20000;
	int minbalsalaryac=0;
	String pan="AbCDK2451J";
    String aadhaar="154515482";
    String driving="ADHJ545";
    String lcat="indian";
    String pcat="indian";
    int pancharlimi=10;
    if(pan=="AbCDK2451J"){
    	if(pcat=="indian"){
    		if(pancharlimi==32){
    	System.out.println("panvalidation done");
    		}else 
    			System.out.println("pan validtion failed");
    }
    }else if(aadhaar=="58584554"){
    	System.out.println("aadhaar validtion done");
    }
    else if(driving=="ADHJ545"){
    	if(lcat=="NRI"){
    	System.out.println("driving validtion done ");
    	}else
    		System.out.println("please provide indian DL");
    }
    if(minbalcurrentac==10000){
    	System.out.println("create(consider) as  current account");
    }else if (minbalsavingac==5000){
    	System.out.println("consider as saving account");
    }else if(minbalsalaryac==0){
    	System.out.println("consider as salary accout");
    }
    else
    	System.out.println("you dont have 10000 so you will not be able to use account");
	
}
}
