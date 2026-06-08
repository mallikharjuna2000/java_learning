package com.codegnan.oop;

public class BankAccount {
	String accountHolderName;
	long accountNumber;
	double balance;

	public void createAccount(String name, long accNumber, double initialBalance) {
		accountHolderName = name;
		accountNumber = accNumber;
		balance=initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + "deposited succesfully");
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + " withdraw succesfully");
		} else {
			System.out.println("Insufficient Funds");
		}
	}

	public void displayAccountInfo() {
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}
