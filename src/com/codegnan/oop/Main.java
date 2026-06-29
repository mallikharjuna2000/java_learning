package com.codegnan.oop;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		Integer x = a;// autoboxing primitive to wrapper class
		System.out.println("Primitive value a " + a);
		System.out.println("Wrapper class Integer x : " + x);
		
		Long l=10000l;
		long y=l;//unboxing wrapper to pritive
		System.out.println("Wrapper class Long value : "+l);
		System.out.println("Primitive long value "+y);
	}
}
