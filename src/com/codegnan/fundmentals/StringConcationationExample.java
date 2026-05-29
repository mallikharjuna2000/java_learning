package com.codegnan.fundmentals;

public class StringConcationationExample {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		String d = "codegnan";
		System.out.println(a + b + c + d);//60codegnan
		System.out.println(b + c + d + a);//50codegnan10
		System.out.println(c + d + a + b);//30codegnan30
		System.out.println(d + a + b + c);//codegnan60
	}

}
