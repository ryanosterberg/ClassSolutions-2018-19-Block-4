package oop;

import java.util.Scanner;

public class BankAccount {
	
	public double balance;
	public double accountNum;
	public double interestRate;
	Scanner input = new Scanner(System.in);
	
	public BankAccount(){
		
	balance = 00.00;
	accountNum = 123456;
	interestRate = 1.1;
	
	}
	
	public double deposit(){
		System.out.println("Amount depositing:");
			balance = balance + input.nextDouble();
		System.out.println("Balance:" + balance);
		return balance;
	}
	public double withdraw(){
		System.out.println("Amount withdrawing:");
			balance = balance - input.nextDouble();
		System.out.println("Balance:" + balance);
		return balance;
	}
	public double addInterest(){
		balance = balance * interestRate;
		System.out.println("Adding interest. Balance:" + balance);
		return balance;
	}
	public double financeCharge(double financeCharge){
		balance = balance - financeCharge;
		System.out.println("Finance charge. Balance:" + balance);
		return balance;
	}
	

	

}
