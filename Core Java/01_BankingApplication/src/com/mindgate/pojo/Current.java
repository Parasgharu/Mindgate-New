package com.mindgate.pojo;

public class Current extends Account {
	private double overdrafBalance;
	private double intialOverdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdrafBalance) {
		super(accountNumber, name, balance);
		this.overdrafBalance = overdrafBalance;
		this.intialOverdraftBalance = overdrafBalance;
		System.out.println("Overloaded constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (amount <= getBalance() + overdrafBalance) {
				amount = amount - getBalance();
				setBalance(0);
				overdrafBalance = overdrafBalance - amount;
				return true;
			}

		}

		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (intialOverdraftBalance > overdrafBalance) {
				if (amount < (intialOverdraftBalance - overdrafBalance)) {
					overdrafBalance = overdrafBalance + amount;
					return true;
				} else {
					amount = amount - (intialOverdraftBalance - overdrafBalance);
					setBalance(getBalance() + amount);
					overdrafBalance = intialOverdraftBalance;
					return true;
				}

			} else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}

	public double getOverdrafBalance() {
		return overdrafBalance;
	}

	public void setOverdrafBalance(double overdrafBalance) {
		this.overdrafBalance = overdrafBalance;
	}

	@Override
	public String toString() {
		return "Current [overdrafBalance=" + overdrafBalance + ", toString()=" + super.toString() + "]";
	}

}
