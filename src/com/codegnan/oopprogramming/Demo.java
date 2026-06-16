package com.codegnan.oopprogramming;

public class Demo {

	public static void main(String[] args) {
		String s1 = new String("Codegnan");
		String s2 = new String("Codegnan");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		StringBuilder sb1 = new StringBuilder("Codegnan");
		StringBuilder sb2 = new StringBuilder("Codegnan");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	
	}

}
