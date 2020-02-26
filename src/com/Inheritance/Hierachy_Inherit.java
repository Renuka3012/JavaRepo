package com.Inheritance;
 class daddy{
	 
	 void salary(){
		 System.out.println("40000");
	 }
	 
 }
 
 class mummy extends daddy{
	 
	 void home(){
		 System.out.println("home");
	 }
	 
	 void salary(){
		 System.out.println("10000");
	 }
	 
 }
 
 class son extends daddy{
	 
	 
	 void salary(){
		 System.out.println("15000");
	 }
	 
 }
 class daughter extends daddy{
	 
	 void salary(){
		 System.out.println("2000");
	 }
	 
 }



public class Hierachy_Inherit {
	public static void main(String[] args) {
		
		daddy dad = new daddy();
		 dad.salary();
		 
		 mummy mom = new mummy();
		 mom.home();
		 mom.salary();
		 
		 son s = new son();
		 s.salary();
		 
		 new daughter().salary();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
