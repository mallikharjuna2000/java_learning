package com.codegnan.oopprogramming;

public class Demo {

	public static void main(String[] args) {
		//immultability
		String s = new String("codegnan");
		s.concat("solutions");
		System.out.println(s);
        //mutability
		StringBuilder sb=new StringBuilder("codegnan");
		sb.append("solutions");
		System.out.println(sb);
	}

}
