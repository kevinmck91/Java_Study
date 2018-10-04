package atm;

import java.util.Random;

public class Account {

	private int balance;

	public Account() {
		Random myRandom = new Random();
		balance = myRandom.nextInt(4991) + 10;
	}

	public void deposit(int depostAmount) {
		balance += depostAmount;
	}

	public void withdraw(int withdrawAmount) {
		balance -= withdrawAmount;
	}

	public int getBalance() {
		return balance;
	}

}
