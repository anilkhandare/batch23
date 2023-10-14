package com.oops;

public class ChildClass extends AbstractDemo implements ParentClass1,ParentClass2,ParentClass3{

	@Override
	public void superMarket() {
		System.out.println("supermarket method");
		
	}

	@Override
	public void farmHouse() {
		System.out.println("farmHouse method");
		
	}

	@Override
	public void home() {
		System.out.println("home method");
		
	}
	/*public void home(){
		System.out.println("kdjfak");
	}*/
	@SuppressWarnings("null")
	public static void main(String[] args) {
		ChildClass childClass= new ChildClass();
		childClass.superMarket();
		childClass.farmHouse();
		childClass.home();
		childClass.home3();
		//childClass.home2();
		ParentClass1.home2();
		//ParentClass1.home3();//Cannot make a static reference to the non-static method home3() from the type ParentClass1
		//ParentClass1 parentClass1= new ParentClass1();// we cant create the object of the interface
		ParentClass1 parentClass1=new ChildClass();
		parentClass1.home();
		//ParentClass1 parentClass2 = null;
		//parentClass2.home();
		//parentClass2.home3();
		AbstractDemo abstractDemo=new ChildClass();
		System.out.println(abstractDemo.i);
		
	}


	

}
