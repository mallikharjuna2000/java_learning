package com.codegnan.fundmentals;

import java.util.Scanner;

public class loopexamples {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n=scanner.nextInt();
		int i;
		/*while(i<=n) {
			System.out.println(i);
			i=i+2;
		}*/
		/*do {
			System.out.println(i);
			i=i+2;
		}while(i<=n);*/
		for( i=1;i<=n;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		scanner.close();

	}

}
