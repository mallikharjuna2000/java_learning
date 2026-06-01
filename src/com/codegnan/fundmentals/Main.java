package com.codegnan.fundmentals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int balance=scanner.nextInt();
		int deposit=scanner.nextInt();
		balance+=deposit;
		boolean isEvenAndGreater1000 =(balance>1000)&&(balance%2==0);
		System.out.println(balance);
		System.out.println(isEvenAndGreater1000);
		scanner.close();

	}

}


