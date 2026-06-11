package com.codegnan.oop;

public class OverloadDemo {
	void test() {
		System.out.println("No Parameters");
	}

	void test(int a, int b) {
		System.out.println(" A and B is " + a + " " + b);
	}

	void test(float a) {
		System.out.println("inside test(double)a " + a);
	}

	public static void main(String[] args) {
		OverloadDemo od=new OverloadDemo();
		od.test();
		od.test('a',20);
        od.test('a');
	}

}
