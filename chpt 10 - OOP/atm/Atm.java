package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Atm {

	ArrayList<Account> listOfAccounts = new ArrayList<Account>();
	Scanner myScan = new Scanner(System.in);
	private int accountNumber;
	private int withdrawAmount;
	private int depositAmount;

	// Constructor
	public Atm() {
		for (int i = 0; i < 10; i++) {
			listOfAccounts.add(new Account());
		}
		System.out.println("Enter Account Number (between 1 and 10) : ");
		setAccountNumber(myScan.nextInt());
	}

	// Method
	public void run() {

		Account account = listOfAccounts.get(accountNumber);
		System.out.println("1. Balance\n2. Withdraw\n3. Deposit\n4. Exit");
		int inputOption = myScan.nextInt();
		
		if (inputOption == 1) {
			System.out.println(account.getBalance());
		}
		else if (inputOption == 2) {
			System.out.println("Enter withdraw amount : ");
			setWithdrawAmount(myScan.nextInt());
			account.withdraw(withdrawAmount);
			System.out.println(withdrawAmount + " has been withdrawn");
		}
		else if (inputOption == 3) {
			System.out.println("Enter deposit amount : ");
			setDepostAmount(myScan.nextInt());
			account.deposit(depositAmount);
			System.out.println(depositAmount + " has been deposited");
		}
		else if (inputOption == 4) {
			System.out.println("Enter Account Number : ");
			setAccountNumber(myScan.nextInt());
		} else {
			System.out.println("Invalid input");
		}
	}

	// Getters + setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public int getDepostAmount() {
		return depositAmount;
	}

	public void setDepostAmount(int depostAmount) {
		this.depositAmount = depostAmount;
	}

}
