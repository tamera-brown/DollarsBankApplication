package com.dollarsbank.model;



import java.time.LocalDate;

import com.dollarsbank.model.Account.AccountType;


public class Transactions {
	public enum TransactionType{
		DEPOSIT, WITHDRAW;
	}
	
	private Double transactionAmount;
    private LocalDate transactionDate;
    private AccountType accType;
    private Integer accountNum;
    private TransactionType transType;
    
    public Transactions() {
    	this(0.0,LocalDate.now(),AccountType.CHECKING,-999,TransactionType.DEPOSIT);
    }

	public Transactions(Double transactionAmount, LocalDate transactionDate, AccountType accType,Integer accNum,
			TransactionType transType) {
		super();
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.accType = accType;
		this.accountNum = accNum;
		this.transType = transType;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}

	public Integer getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		this.accountNum = accountNum;
	}

	public TransactionType getTransType() {
		return transType;
	}

	public void setTransType(TransactionType transType) {
		this.transType = transType;
	}

	@Override
	public String toString() {
		return "Transactions [transactionAmount=" + transactionAmount + ", transactionDate=" + transactionDate
				+ ", accType=" + accType + ", accountNum=" + accountNum + ", transType=" + transType + "]";
	}
    
}
