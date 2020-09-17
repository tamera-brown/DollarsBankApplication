package com.dollarsbank.service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;
import com.dollarsbank.model.Transactions;
import com.dollarsbank.application.DollarsBankApplication;

public class CustomerService {

	  static HashMap<String, Customer> customers = new HashMap<String, Customer>();
	  

public static void createAccount(Scanner info) {

	info= new Scanner(System.in);
    String name;
    String address;
    String phonenum;
    String customerId;
    String password;

    Stack<Transactions> transactions = new Stack<Transactions>();
    Transactions Newtransaction = new Transactions();
    HashMap<Long, Account> accounts = new HashMap<Long, Account>();
    Account Newaccount = new Account();
    Double initamount = 0.00;


    System.out.println("Customer Name: ");
    
        name = info.nextLine();
        System.out.println(name);
        System.out.println("Customer Address: ");
         address = info.nextLine();
         System.out.println(address);
       
         System.out.println("Customer Contact Number");
         phonenum = info.nextLine();
         System.out.println(phonenum);
         System.out.println("User Id");
         
         
          customerId = info.nextLine();
          System.out.println(customerId);
          System.out.println("Password: 8 Characters With Lower,Upper & Special");
          password = info.nextLine();
          System.out.println(password);
          System.out.println("Initial Deposit Amount");
          
          initamount = info.nextDouble();
          System.out.println(initamount);
        
              long counter=0;
              Newaccount.setAccountNum(counter);
              Newaccount.setBalance(initamount);
              Newaccount.setCustomerId(customerId);
          
              accounts.put(Newaccount.getAccountNum(), Newaccount);
              Newtransaction.setTransactionAmount(initamount);
              transactions.push(Newtransaction);
            
              Customer newCustomer = new Customer(name, address, phonenum, customerId, password, initamount, transactions, accounts);
              System.out.println(newCustomer);
              System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");

              customers.put(newCustomer.getCustomerId(), newCustomer);
              System.out.println("Successually Created!");
              
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
    
        if(!customers.containsKey(customerId) || (!customers.containsKey(password))) {
            System.out.println("Invalid Credentials. Try again!");
        } else {
            Customer found = customers.get(customerId);
            if(!password.equals(found.getPassword())) {
                System.out.println("Invalid Password. Try again!");
            } else {
            		DollarsBankApplication.CustomerMenu(info);
            }

    
}
}
}



