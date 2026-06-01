package com.codegnan.fundmentals;

import java.util.Scanner;

public class PositiveNumberExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number=scanner.nextInt();
		if(number>0) {
			System.out.println("The Number : "+number+" is positive");
		}else {
			System.out.println("The Number : "+number+" is Negative");
		}
		scanner.close();

	}

}// temprature >30 temprature is high
//tempratute<10 cool
// >10 and <30 : temparture is normal
