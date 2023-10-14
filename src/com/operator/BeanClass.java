package com.operator;

public class BeanClass {
   public Object instanceofDemo(ProviderRegistryConfig o){
	   if(o instanceof ProviderRegistryConfig){
		    System.out.println("providerregistryconfig has istance of Object");
		   //o.notify();   
	   }
	return o;
   }
   public static void main(String[] args) {
	BeanClass bean= new BeanClass();
	ProviderRegistryConfig provider = new ProviderRegistryConfig();
	bean.instanceofDemo(provider);
}
}
