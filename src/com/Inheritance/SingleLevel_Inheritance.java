package com.Inheritance;
class A{
	
	void m1(){
		System.out.println("m1");
		
	}
	
}

class B extends A
{
	void m2(){
		System.out.println("m2"); //If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
	}
 

}


public class SingleLevel_Inheritance {
	
	
	public static void main(String[] args) {
		
		
		
		A a= new B();
		A c= new B();
		c.m1();
		a.m1();
		B b= new B();
		
		b.m1();
		b.m2();
		
		
	}
	
	
	
	
	

}
