package com.dushyantsingh.test;

import java.util.Scanner;

import com.dushyantsingh.model.Customer;
import com.dushyantsingh.service.BankingOperations;

public class BankingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankingOperations bo = new BankingOperations();
		Customer customer1 = new Customer("DUSH6375", "DUSH123");
      System.out.println("!!!Welcome to Digi Bank!!!");
      System.out.println("Please Enter your Account no.: ");
      String acctNo= sc.nextLine();
      System.out.println("Please enter the password: ");
      String password= sc.nextLine();
      
      if(customer1.getBankAccountNo().equals(acctNo) && customer1.getPassword().equals(password))
      {
    	  int option =0;
    	  do
    	  {
    	  System.out.println("Please Select One of the Options From it: ");
    	  System.out.println("1. Deposit");
    	  System.out.println("2. Withdraw");
    	  System.out.println("3. Trasfer");
    	  System.out.println("4. Log-out");
    	  
    	  option = Integer.parseInt(sc.nextLine());
    	  int amount=0;
    	  
    	  switch(option)
    	  {
    	  case 1:
    		  System.out.println("Please Enter Amount: ");
    		  amount = Integer.parseInt(sc.nextLine());
    		  bo.deposit(amount);
    		  break;
    	  case 2:
    		  System.out.println("Please Enter Amount: ");
    		  amount = Integer.parseInt(sc.nextLine());
    		  bo.withdraw(amount);
    		  break;
    	  case 3:
    		  System.out.println("Please Enter Receiver's Amount Number: ");
    		  String toAccountNo=sc.nextLine();
    		  System.out.println("Please Enter Amount: ");
    		  amount = Integer.parseInt(sc.nextLine());
    		  bo.transfer(amount, toAccountNo);
    		  break;
    	  case 4:
    		  option=-1;
    		  break;
    	  }
    	  }while(option!=-1);
      }
      else 
      {
    	 System.out.println("Invalid Account No. and Password"); 
      }
   
	}
}
