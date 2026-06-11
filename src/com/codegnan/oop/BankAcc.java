package com.codegnan.oop;

public class BankAcc {
	double balance;

	public BankAcc(double balance) {
		super();
		this.balance = balance;
	}

// deposit amount by cash
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited Cash : " + amount);
	}

	public void deposit(double amount, String chequeNumber) {
		balance += amount;
		System.out.println("Deposited : " + amount + " Via Cheque " + chequeNumber);
	}

	public void deposit(double amount, String transactionId, String bankName) {
		balance += amount;
		System.out.println("Deepositeed " + amount + "via online transfer");
		System.out.println("Transaction ID :" + transactionId + " Bank :" + bankName);
	}

	public void showBalance() {
		System.out.println("Current Balance : " + balance);
	}

	public static void main(String[] args) {
		BankAcc acc = new BankAcc(5000.0);
		acc.deposit(2000);
		acc.deposit(12000, "chq1234");
		acc.deposit(3000, "TXN6872163786", "HDFC");
		acc.showBalance();

	}
}
