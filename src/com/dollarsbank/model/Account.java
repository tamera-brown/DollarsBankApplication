package com.dollarsbank.model;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum AccountType{
		CHECKING, SAVINGS
	}
	
	private Integer accountNum;
	private Integer customerId;
	private double balance;
	private AccountType acctype;
	
	public Account() {
		// TODO Auto-generated constructor stub
		this(-999,-999,0.0,AccountType.CHECKING);
	}

	public Account(int accountNum, int customerId, double balance, AccountType acctype) {
		// TODO Auto-generated constructor stub
		super();
		this.accountNum=accountNum;
		this.customerId=customerId;
		this.balance=balance;
		this.acctype=acctype;
	}

	public Integer getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		this.accountNum = accountNum;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccType() {
		return acctype;
	}

	public void setAccType(AccountType acctype) {
		this.acctype = acctype;
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", customerId=" + customerId + ", balance=" + balance + ", acctype="
				+ acctype + "]";
	}
	
	
}
