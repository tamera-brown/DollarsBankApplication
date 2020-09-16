package com.dollarsbank.controller;



public class DollarsBankController {
	
	int balance;
	int Transctions;
	String customerName;
	String customerId;
	
	public DollarsBankController(String cname, String cid) {
	// TODO Auto-generated constructor stub
	customerName= cname;
	customerId = cid;
}
void deposit(int amount) {
	
	if(balance==0 || amount > 0) {
		balance += amount;
		Transctions=amount;
		
	}
}
void withdraw(int amount) {
	if(balance !=0 || amount > 0) {
		balance-=amount;
		Transctions=-amount;
	}
	else {
		System.out.println("Cannot withdraw");
	}
}
void Transactions() {
	if(Transctions > 0) {
		System.out.println("Deposited: " + Transctions);
	}
	else if(Transctions < 0) {
		System.out.println("Withdrawn: " + Math.abs(Transctions));
	}
	else {
		System.out.println("No transaction occured");
	}
}

}