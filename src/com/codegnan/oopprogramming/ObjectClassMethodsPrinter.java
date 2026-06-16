package com.codegnan.oopprogramming;

import java.lang.reflect.Method;

public class ObjectClassMethodsPrinter {

	public static void main(String[] args) {
		Class<?>objectClass=Object.class;
		Method[] methods=objectClass.getDeclaredMethods();
		System.out.println("Methods Declared in java.lang.Object class");
		int count=0;
		for(Method method:methods) {
			count++;
			System.out.println(count+ " : "+method);
		}
		System.out.println("Total Methods declareed in java.lang.Object class "+count);
		

	}

}
