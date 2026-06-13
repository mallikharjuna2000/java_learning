package com.codegnan.oop;

public class Child extends Parent {
	
	public Child() {
		super();
		System.out.println("Child Class Cnstructor");
		// TODO Auto-generated constructor stub
	}
	int x=20;
	public void methodOne() {
		super.methodOne();
		System.out.println("parent class x value "+super.x);//10
		System.out.println("Child class x value "+this.x);//20
	}
}
