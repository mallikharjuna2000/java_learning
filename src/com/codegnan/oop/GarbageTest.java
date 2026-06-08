package com.codegnan.oop;

public class GarbageTest {
protected void finalize() {
	System.out.println("Garbage Collector called finalize()");
}
	public static void main(String[] args) {
		GarbageTest obj = new GarbageTest();
		//obj.finalize();
		obj = null;
		System.out.println("Requesting garbage Collection");
		System.gc();
		System.out.println("End of main method");

	}

}
