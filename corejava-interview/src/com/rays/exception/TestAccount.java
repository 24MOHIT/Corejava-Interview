package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(10000);

		a.deposit(5000);

		try {

			a.withdrawl(1500);

		} catch (InsufficientBalance e) {
			System.out.println(e);
		}
		
	}
}
