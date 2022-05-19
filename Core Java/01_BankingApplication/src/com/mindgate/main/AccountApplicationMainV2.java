package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {

	public static void main(String[] args) {
		Account account = new Account(101, "Paras", 1000);
		boolean result = account.withdraw(200);
		if (result) {
			System.out.println("Transaction completed successfully");
			System.out.println("Balance :" + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println("Balance :" + account.getBalance());
		}

		System.out.println("-".repeat(50));

		result = account.deposit(2000);
		if (result) {
			System.out.println("Amount deposited successfully");
			System.out.println("Balance :" + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println("Balance :" + account.getBalance());
		}

	}

}
