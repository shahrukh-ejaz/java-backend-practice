package com.shahrukh.constructors2;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount(1001, "Shahrukh");
		BankAccount b3 = new BankAccount(1002, "Aman", 5000.0);
		
		b1.displayAccount();
		b2.displayAccount();
		b3.displayAccount();
	}

}
