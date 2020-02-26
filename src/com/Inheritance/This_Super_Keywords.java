package com.Inheritance;

class parent{
	
	int a=100;
	int b=200;
	void m1(){
		System.out.println(" Parent m1");
	}
	
}

class child extends parent{
	 int x=100;
	 int y=500;
	 void add(int i, int j){
		 System.out.println(i+j);  //450
		 System.out.println(a+b);  // 300
		 System.out.println(x+y); // 600
		 
	 }
}
class grand extends parent{
	
	int a=100;
	int b= 300;
	void add(int a ,int b){
		System.out.println(a+b);// passing arguments --- 4200
		System.out.println(this.a+this.b);//local variables ---- 400
		System.out.println(super.a + super.b);//super variables ------- 300
	}
}


class grandson extends grand{
	
	void m1(){
		System.out.println("child m1 ");
	}
	
	void m2()
	{ 
		m1();   // local methods -------child m1
		 this.m1(); // --------child m1
		//this.m2(); // java.lang.StackOverflowError
		super.m1(); // super methods ------ parent m1
	}
	
}



public class This_Super_Keywords {
	public static void main(String[] args) {
		
		new child().add(250, 200);
		
		new grand().add(200, 4000);
		
		new grandson().m1(); // local method
		new grandson().m2();
		 
		
	}

	

}
