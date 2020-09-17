package com.dollarsbank.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Stack;

public class Customer implements Serializable{


 private static final long serialVersionUID = 1L;
 
 
 private String Name;
 private String Address;
 private String Phonenum;
 private Integer customerId=1;
 private String Password;
 private Double Initamount;
 private Stack<Transactions> transactions;
 private HashMap<Long, Account> accounts;
 

public Customer() {
  this("N/A","N/A","N/A",-999,"N/A",0.0, new Stack<Transactions>(), new HashMap<Long, Account>());
}


public Customer(String name, String address, String phonenum, Integer customerId, String password, Double initamount,
		Stack<Transactions> transactions, HashMap<Long, Account> accounts) {
	super();
	this.Name = name;
	this.Address = address;
	this.Phonenum = phonenum;
	this.customerId = customerId;
	this.Password = password;
	this.Initamount = initamount;
	this.transactions = transactions;
	this.accounts = accounts;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public String getPhonenum() {
	return Phonenum;
}


public void setPhonenum(String phonenum) {
	Phonenum = phonenum;
}


public Integer getCustomerId() {
	return customerId;
}


public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}


public String getPassword() {
	return Password;
}


public void setPassword(String password) {
	Password = password;
}


public Double getInitamount() {
	return Initamount;
}


public void setInitamount(Double initamount) {
	Initamount = initamount;
}


public Stack<Transactions> getTransactions() {
	return transactions;
}


public void setTransactions(Stack<Transactions> transactions) {
	this.transactions = transactions;
}


public HashMap<Long, Account> getAccounts() {
	return accounts;
}


public void setAccounts(HashMap<Long, Account> accounts) {
	this.accounts = accounts;
}


@Override
public String toString() {
	return "Customer [Name=" + Name + ", Address=" + Address + ", Phonenum=" + Phonenum + ", customerId=" + customerId
			+ ", Password=" + Password + ", Initamount=" + Initamount + ", transactions=" + transactions + ", accounts="
			+ accounts + "]";
}



}