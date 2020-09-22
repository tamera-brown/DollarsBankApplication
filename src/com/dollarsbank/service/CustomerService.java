package com.dollarsbank.service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dollarsbank.model.Account;

import com.dollarsbank.model.Customer;
import com.dollarsbank.model.Transactions;
import com.dollarsbank.model.Transactions.TransactionType;

import com.dollarsbank.application.DollarsBankApplication;

public class CustomerService {
	static long counter=0;
	final static Stack<Transactions> transactions = new Stack<Transactions>();
	
	static HashMap<Long, Account> accounts = new HashMap<Long, Account>();
	static Account Newaccount = new Account();

	  static HashMap<String, Customer> customers = new HashMap<String, Customer>();
	  

public static void createAccount(Scanner info) {

	info= new Scanner(System.in);
	String name;
	String address;
	String phonenum;
	String customerId;
	String password;
	Pattern phoneNumberRegex= Pattern.compile("^\\(\\d{3}\\)\\s?\\d{3}-\\d{4}$");
	Pattern addressRegex = Pattern.compile("^\\d+ [A-Z][a-z]* (Street|Avenue), [A-Z][a-z]*, [A-Z]{2} \\d{5}$");
	Pattern passwordRegex = Pattern.compile("(?=.*[a-z])(?=.*[@#$%!^&])(?=.*[A-Z]).{8}");
    boolean validPhonenum;
    boolean validAddress;
    boolean validPassword;

	
	Transactions Newtransaction = new Transactions();
	

	Double initamount = 0.00;
	
	
	  


    System.out.println("Customer Name: ");
    
        name = info.nextLine();
        System.out.println(name);
        System.out.println("Customer Address: ");
         address = info.nextLine();
         System.out.println(address);
         Matcher addressMatcher=addressRegex.matcher(address);
         validAddress=addressMatcher.matches();
         
         while(validAddress==false) {
        	 System.out.println("Invalid Address. Try again");
        	 System.out.println("Customer Address");
             address = info.nextLine();
             addressMatcher= addressRegex.matcher(address);
             validAddress= addressMatcher.matches();
         }
         
       
         System.out.println("Customer Contact Number");
         phonenum = info.nextLine();
         System.out.println(phonenum); 
         Matcher phoneMatcher = phoneNumberRegex.matcher(phonenum);
         validPhonenum= phoneMatcher.matches();
         
         
         while(validPhonenum==false) {
        	
        	 System.out.println("Invalid Phone Number. Try again");
        	 System.out.println("Customer Contact Number");
             phonenum = info.nextLine();
             phoneMatcher = phoneNumberRegex.matcher(phonenum);
             validPhonenum= phoneMatcher.matches();
         }
        
         
         System.out.println("Customer ID");
          customerId = info.nextLine();
          System.out.println(customerId);
          System.out.println("Password: 8 Characters With Lower,Upper & Special");
          password = info.nextLine();
          System.out.println(password);
          Matcher passwordMatcher =passwordRegex.matcher(password);
          validPassword=passwordMatcher.matches();
          while(validPassword==false) {
        	  
        	  System.out.println("Invalid Password. Try again");
         	 System.out.println("Password");
              password = info.nextLine();
              passwordMatcher = passwordRegex.matcher(password);
              validPassword= passwordMatcher.matches();
          }
          System.out.println("Initial Deposit Amount");
          
          initamount = info.nextDouble();
          
          while(initamount < 0) {
        	  System.out.println("Cannot be negative!");
        	  System.out.println("Initial Deposit Amount");
              
              initamount = info.nextDouble();
              
          }
         
          System.out.println(initamount);
        
           
              Newaccount.setAccountNum(++counter);
              Newaccount.setBalance(initamount);
              Newaccount.setCustomerId(customerId);
          
              accounts.put(Newaccount.getAccountNum(), Newaccount);
              Newtransaction.setTransactionAmount(initamount);
              Newtransaction.setAccountNum(counter);
              transactions.push(Newtransaction);
            
              Customer newCustomer = new Customer(name, address, phonenum, customerId, password, initamount, transactions, accounts);
             // System.out.println(newCustomer);
              

              customers.put(newCustomer.getCustomerId(), newCustomer);
              System.out.println("Account Successually Created! ");
              
             DollarsBankApplication.Menu(info);
             info.close();
          }

          


public static void login(Scanner info) {
    info = new Scanner(System.in);
    String customerId;
    String password;
    System.out.println("User Id: ");
    
        customerId = info.nextLine();
    
    System.out.println("Password: ");
   
        password = info.nextLine();
        
        Customer found = customers.get(customerId);
    
        while(!customers.containsKey(customerId) || !password.equals(found.getPassword()) ) {
            System.out.println("Invalid CutomerId or Password. Try again!");
            login(info);
        }
            	 System.out.println("Login Success");
            	DollarsBankApplication.CustomerMenu(info);
            

    info.close();
}

public static void deposit(Scanner num) {
	Transactions Newtransaction = new Transactions();
	
	double currentBalance=Newaccount.getBalance();

	 num = new Scanner(System.in);
	Double depositAmount;
	
	System.out.println("Enter Amount to deposit: ");
    
    depositAmount = num.nextDouble();
    while(depositAmount < 0) {
  	  System.out.println("Cannot be negative!");

  	System.out.println("Enter Amount to deposit: ");
      
        
        depositAmount = num.nextDouble();
      
        
    }
    	currentBalance+=depositAmount;
    	Newtransaction.setTransactionAmount(depositAmount);
    	
    	Newtransaction.setAccountNum(counter);
    	transactions.push(Newtransaction);
    	//System.out.println(transactions);
    	Newaccount.setBalance(currentBalance);
    	
    	//System.out.println(Newaccount);
    	
    	System.out.println("Deposited " + Newtransaction.getTransactionAmount() + " into account [ " + Newaccount.getAccountNum() + " ]");
    	System.out.println("Current Balance: "+ currentBalance);
    	

}
public static void withdraw(Scanner num) {
	Transactions Newtransaction = new Transactions();
	
	double currentBalance=Newaccount.getBalance();
	
	
	 num = new Scanner(System.in);
	Double withdrawAmount;
	
	System.out.println("Enter Amount to withdraw: ");
    
    withdrawAmount = num.nextDouble();
    while(withdrawAmount < 0) {
  	  System.out.println("Cannot be negative!");

  	System.out.println("Enter Amount to withdraw: ");
      
        
        withdrawAmount = num.nextDouble();
      
        
    }
    while(withdrawAmount > currentBalance) {
    	System.out.println("Insufficient Funds");
    	System.out.println("Enter Amount to withdraw: ");
      
        
        withdrawAmount = num.nextDouble();
      
        
    }
    	currentBalance-=withdrawAmount;
    	Newtransaction.setTransactionAmount(withdrawAmount);
    	Newtransaction.setTransType(TransactionType.WITHDRAW);
    	
    	Newtransaction.setAccountNum(counter);
    	transactions.push(Newtransaction);
    	//System.out.println(transactions);
    	Newaccount.setBalance(currentBalance);
    	//System.out.println(Newaccount);
    	System.out.println("Withdrew " + Newtransaction.getTransactionAmount() + " from account [ " + Newaccount.getAccountNum() + " ]");
    	System.out.println("Current Balance: "+ currentBalance);
    	

}
public static void recentTransactions() {
	
for(int i=0;i < 5;i++) {
	System.out.println(transactions.get(i));
}
}
public static void CustomerInfo() {
	System.out.println(customers);
}
}



