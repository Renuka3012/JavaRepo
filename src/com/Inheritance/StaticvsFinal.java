package com.Inheritance;

public class StaticvsFinal {

	  int increment =0;
	public void increment(){
		 increment++;
	}
	public static void main(String[] args) {
		
		StaticvsFinal sf1 = new StaticvsFinal();
		StaticvsFinal sf2 = new StaticvsFinal();
		sf1.increment();
		
		sf2.increment();
		
		
		System.out.println(sf1.increment);
		System.out.println(sf2.increment);
	}
}
