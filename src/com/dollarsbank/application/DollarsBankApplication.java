package com.dollarsbank.application;

import java.util.Scanner;

import com.dollarsbank.controller.DollarsBankController;

import sun.jvm.hotspot.ci.ciBaseObject;



public class DollarsBankApplication {

	public static void main(String[] args) {
//		BankAccount oBankAccount = new BankAccount("Tamera", "1114225");
//		oBankAccount.showMenu();
//	}
//}
			
		int choice;
		Scanner input =new Scanner(System.in);
			
			System.out.println("+-----------------------------+");
			System.out.println("| DOLLARSBANK Welcomes You!   |");
			System.out.println("+-----------------------------+");
			System.out.println("1.Create New Account\n2.Login\n3.Exit.");
			
			do {
				System.out.println("Enter 1, 2, or 3");
				choice=input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("+--------------------------------+");
				System.out.println("| Enter Details For New Account  |");
				System.out.println("+--------------------------------+");
			
				System.out.println("Customer Name");
				String customerName=input.nextLine();
				System.out.println("Customer Address");
				String address=input.nextLine();
				System.out.println("Customer Contant Number");
				String contactNumber=input.nextLine();
				System.out.println("User ID");
				String createuserId=input.next();		
				System.out.println("Password : 8 characters with Lower,Upper and Special");
				String createpassword=input.nextLine();
				input.nextLine();
				System.out.println("Initial Deposit Amount");
				int deposit=input.nextInt();
				
			
			System.out.println("Successually Created!");
				
			System.out.println("+-----------------------------+");
			System.out.println("| DOLLARSBANK Welcomes You!   |");
			System.out.println("+-----------------------------+");
		  
			System.out.println("1.Create New Account\n2.Login\n3.Exit.");
			choice=input.nextInt();
			break;
			
			
			case 2:
				 
				 System.out.println("+-----------------------+");
				 System.out.println("| Enter Login Details   |");
				 System.out.println("+-----------------------+");
							            
				 
				System.out.println(" User ID");
				String userId=input.next();	
				System.out.println(" Password ");
				input.nextLine();
				String password=input.nextLine();
				
				 Boolean vaild=login();
				 
				if (vaild==false) {
					System.out.println("Invalid Credentials,Try again");
					
					System.out.println("+-----------------------+");
					System.out.println("| Enter Login Details   |");
					System.out.println("+-----------------------+");
								            
					
					System.out.println(" User ID");
					userId=input.next();	
					System.out.println(" Password ");
					password=input.nextLine();
					
				}
				else if (vaild==true) {
					System.out.println("+----------------------+");
					System.out.println("| Welcome " + userId +" |");
					System.out.println("+----------------------+");
							            
				
					System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.Funds Transfer"
							+ "\n4.View 5 recent transactions\n6.Sign Out");
					
					
				}
				break;
			case 3:
				System.out.println("Goodbye");
				break;
				
			default:
				System.out.println("Invail option!!!. Please try again");
				
				
			}
			
			}while(choice!=3);
			System.out.println("Thank you for choosing DollarsBank!");
			 
			
			 input.close();
			
			
		}
			
			
		}

	