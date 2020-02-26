package com.Polymorphism;

class A{
	void m1(){
		System.out.println("m1");
	}
	
	void m1(int a){
		System.out.println("int a");
	}
	
	void m1(char a){
		System.out.println("char ");
	}
	 
}

 
public class Overloading {
	public static void main(String[] args) {
		new A().m1();
		new A().m1(10);
		new A().m1('a');
	}

}
