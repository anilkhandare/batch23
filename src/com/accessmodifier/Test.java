package com.accessmodifier;

 abstract class Test{
	volatile int i;//Illegal modifier for the field i; only public, protected, private, static, final, transient & volatile are permitted
  abstract void test();
}