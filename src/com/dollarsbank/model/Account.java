package com.dollarsbank.model;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum AccountType{
		
	
		CHECKING, SAVINGS
	}
	
	private Long accountNum;
	private String customerId;
	private double balance;
	private AccountType acctype;
	
	public Account() {
		// TODO Auto-generated constructor stub
		this(0L,"N/A",0.0,AccountType.CHECKING);
	}

	public Account(Long accountNum, String customerId, double balance, AccountType acctype) {
		// TODO Auto-generated constructor stub
		super();
		this.accountNum=accountNum;
		this.customerId=customerId;
		this.balance=balance;
		this.acctype=acctype;
	}

	public Long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
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
