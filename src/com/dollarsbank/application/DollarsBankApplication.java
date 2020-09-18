package com.dollarsbank.application;



import java.util.Scanner;


import com.dollarsbank.service.CustomerService;


public class DollarsBankApplication {
	

	public static void main(String[] args) {
		Scanner option=null;
		Menu(option);
	}
		    
			
		
		public static  void Menu(Scanner option) {
			
			int choice;
		 option =new Scanner(System.in);
			
			System.out.println("+-----------------------------+");
			System.out.println("| DOLLARSBANK Welcomes You!   |");
			System.out.println("+-----------------------------+");
			System.out.println("1.Create New Account\n2.Login\n3.Exit.");
			
			
				System.out.println("Enter (1, 2, or 3)");
				
				choice=option.nextInt();
				switch(choice) {
				case 1:
					CustomerService.createAccount(option);
					
								
					break;
				case 2:
					CustomerService.login(option);
					break;
				case 3:
					System.out.println("Goodbye");
					System.out.println("Thank you for choosing DollarsBank!");
					break;
					
				default:
					System.out.println("Invail option!!!. Please try again");
					Menu(option);
					break;
					
					
				}
			}
			
		

		public static void CustomerMenu(Scanner option) {
			
	        int choice;
	        option = new Scanner(System.in);
	        System.out.println("+----------------------+");
		    System.out.println("|   Welcome Customer   |");
		    System.out.println("+----------------------+");
				            
	
		System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.Funds Transfer"
				+ "\n4.View 5 recent transactions\n6.Sign Out");
		 System.out.println("Enter choice (1, 2, 3, 4, 5 or 6)");
		 
	        choice = option.nextInt();
	        switch (choice) {
	        case 1:
	        	CustomerService.deposit(option);
	        	CustomerMenu(option);
	        	break;
	        case 2:
	        	CustomerService.withdraw(option);
	        	CustomerMenu(option);
	        	break;
	        case 4:
	        	CustomerService.recentTransactions();
	        	CustomerMenu(option);
	        	break;
			case 6: 
				System.out.println("Sucessfully Signed Out");
				Menu(option);
				break;
				
			
			default:
				System.out.println("Invail option!!!. Please try again");
				
			}
	      
	    }
	 }


//
//	