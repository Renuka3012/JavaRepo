package com.Inheritance;
class Aa{
	
	void m1(){
		System.out.println("m1");
		
	}
	
}

class Bb extends Aa
{
	void m2(){
		System.out.println("m2");
	}
}

class Cc extends Bb {
	void m3(){
		System.out.println("m3");
		
	}
}
 


public class MultiLevel_Inherit {
	
	public static void main(String[] args) {
		
		new Cc().m1();        // 1
		
		Cc c=new Cc() ;       // 2
		c.m1();
		c.m2();
		c.m3();
		
		
	}
	
}
	 