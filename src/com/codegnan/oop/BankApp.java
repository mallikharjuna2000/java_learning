package com.codegnan.oop;

public class BankApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.createAccount("malli", 192874687264l, 50000);
		BankAccount acc2 = new BankAccount();
		acc2.createAccount("arjun", 6424754657l, 40000);
		acc1.deposit(10000);
		acc1.withdraw(2700);
		acc1.displayAccountInfo();
		acc2.withdraw(20000);
		acc2.displayAccountInfo();
	}

}
