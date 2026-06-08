package com.codegnan.oop;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total Memory of the heap " + runtime.totalMemory());
		System.out.println("Free Memory of the Heap : " + runtime.freeMemory());
		for (int i = 0; i < 100000; i++) {//127926272
			Date d = new Date();
			d=null;
		}
		System.out.println("Free Memory of the Heap : " + runtime.freeMemory());
		runtime.gc();
		System.out.println("Free Memory of the Heap : " + runtime.freeMemory());
	}

}
