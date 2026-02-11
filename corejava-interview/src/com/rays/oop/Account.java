package com.rays.oop;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {

		balance = balance + amount;
		
		System.out.println("Balance = "+ balance);

	}
	
	public void withdrawl(int amount) {
		
		if (balance - amount >= 2000) {
			
			balance = balance - amount;
			
			System.out.println("Balance = "+ balance);
			
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
