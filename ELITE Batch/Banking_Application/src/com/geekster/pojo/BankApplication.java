package com.geekster.pojo;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount user1=new BankAccount("Prathamesh", 1);
		BankApplication obj=new BankApplication();
		obj.showMenu(user1);
		
	}
	public void showMenu(BankAccount user) {
		int option=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome "+user.getCustomerName());
		System.out.println("Your id is: "+user.getCustomerId());
//		System.out.println("1. Check Balance");
//		System.out.println("2. Deposit");
//		System.out.println("3. Withdraw");
//		System.out.println("4. Previous Trnsaction");
//		System.out.println("5. Exit");
		
		do {
			System.out.println("********************");
			System.out.println("Select an option");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Previous Transaction");
			System.out.println("5. Exit");
			
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Balance: "+user.getBalance());
				break;
			case 2:
				System.out.println("Enter amount to deposit: ");
				int amount=sc.nextInt();
				user.deposit(amount);
				break;
			case 3:
				System.out.println("Enter amount to withdraw: ");
				int wamount=sc.nextInt();
				user.withdraw(wamount);
				break;
			case 4:
				user.getPreviousTransaction();
				break;
			case 5:
				System.out.println("***************");
				break;
			default:
				System.out.println("Kindly select correct option");
				break;
			}
		} while (option!=5);
		
		
	}

}
