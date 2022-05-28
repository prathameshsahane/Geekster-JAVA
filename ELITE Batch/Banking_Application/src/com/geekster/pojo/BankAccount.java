package com.geekster.pojo;

import javax.sound.midi.Soundbank;

public class BankAccount {

	private int customerId;
	private String customerName;
	private int balance; //int doesn't allow us to assign null value to it so we used Integer
	private int prevTransaction;
	
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPrevTransaction() {
		return prevTransaction;
	}

	public void setPrevTransaction(int prevTransaction) {
		this.prevTransaction = prevTransaction;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BankAccount(String customerName,int customerId) {
		this.customerName=customerName;
		this.customerId=customerId;
	}
	
	public void checkBalance() {
		System.out.println("Current balance is: "+balance);
	}
	
	public void deposit(int amount) {
		if(amount> 0) {
			balance+=amount;
			prevTransaction=amount;
		}
		else {
			System.out.println("Please enter valid amount");
		}
	}
	
	public void withdraw(int amount) {
		if(amount>0) {
			if(balance<amount) {
				System.out.println("Low Balance Can't Withdraw");
			}
			else {
				balance-=amount;
				prevTransaction= -amount;
			}
		}
		else {
			System.out.println("Please enter valid amount");
		}
		
		
	}
	public void getPreviousTransaction() {
		if(prevTransaction>0) {
			System.out.println("Deposite: "+prevTransaction);
		}
		else if (prevTransaction<0) {
			System.out.println("Withdrawn: "+Math.abs(prevTransaction));
		}else {
			System.out.println("No Transaction");
		}
	}
	
	
}
