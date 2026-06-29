package com.codegnan.multithreading;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public synchronized void  withdraw(String user, double amount) {
		System.out.println(user + "Trying to withdraw " + amount);
		if (balance >= amount) {
			System.out.println(user + " is processing withdrawl");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(user + "Completed withdrawl remaing balance " + balance);
		} else {
			System.out.println(user + " Insufficinet Funds. available balance " + balance);
		}
		System.out.println("--------------------------------------------");
	}
}
