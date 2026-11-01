package com.shahrukh.constructors2;

public class BankAccount {
	long accountNumber;
	String accountHolder;
	double balance;
	
	BankAccount(){
		this(0,"Unknown", 0.0);
	}
	
	BankAccount(long accountNumber, String accountHolder ){
		this(accountNumber, accountHolder, 1000.0);
		
	}

	 BankAccount(long accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	void displayAccount() {
		 System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	        System.out.println("--------------------");
	}
}
