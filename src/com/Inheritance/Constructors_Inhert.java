package com.Inheritance;
 class shiva{
	 
	 {
		 System.out.println("Parent instance block"); // instance block
		 
	 }
	 static {
		 System.out.println("Parent static block"); //executed only one once at highest(first) priority whenever class calls .......
	 }
	 
	 shiva(){
	 System.out.println("hiiik");
}
//	  
//	 shiva(int a){
//		 
//		 System.out.println("hi siva");
		 
	 
 }
 
 class renu extends shiva{
	 
	 {
		 System.out.println("child instance block");
	 }
	 
	 static {
		 System.out.println("child static block");
	 }
	 
	 renu(){
		 //super(10);
		// this(10); // calling child constructor
		 System.out.println("hi renu");
	 }
	 
	 renu(int a){
		 //super();
		// super(10); // calling parent constructor
		 System.out.println("add");
	 }		
	
 }
 
public class Constructors_Inhert {
	
	
public static void main(String[] args) {
	
	renu re= new renu();
	new renu(10);
	
	
}
}
