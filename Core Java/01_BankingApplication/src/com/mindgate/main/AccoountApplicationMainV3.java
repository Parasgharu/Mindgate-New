package com.mindgate.main;

import java.time.temporal.TemporalAmount;
import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccoountApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int transcationChoice;
		double amount;
		boolean result;
		String countieChoice;
		boolean isSalary;

		System.out.println("Welcome to the Bank");

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter name");
		name = scanner.next();

		System.out.println("Enter balance");
		balance = scanner.nextDouble();
		
		Account account = new Account(accountNumber, name, balance);

		System.out.println("Account Opened Succesfully");

		do {
			System.out.println("Menu");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Check Balance");
			System.out.println("Enter Your Choice");

			transcationChoice = scanner.nextInt();

			switch (transcationChoice) {
			case 1:
				System.out.println("Enter amount wanted to be withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("withdraw succesfully");
					System.out.println("Balance:" + account.getBalance());
				} else {
					System.out.println("withdraw failed");
					System.out.println("Balance:" + account.getBalance());
				}

				break;
			case 2:
				System.out.println("Enter amount wanted to be deposit");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("Deposit succesfully");
					System.out.println("Balance:" + account.getBalance());
				} else {
					System.out.println("Deposit failed");
					System.out.println("Balance:" + account.getBalance());
				}

				break;
			case 3:
				System.out.println("Balance :" + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("THANK YOU FOR BANKING WITH US.");
			System.out.println("Do you want to countinue ?? Yes/No");
			countieChoice = scanner.next();
			
		} while (countieChoice.equals("yes"));
		System.out.println("Thank You");
	} 
	

}