package com.dushyantsingh.service;

import java.util.Scanner;

public class BankingOperations {
	
	private int bankBalance=5000;
	
	public void deposit(int amount)
	{
		bankBalance+=amount;
		System.out.println("Sucessfully Deposited");
		System.out.println("balance :"+ bankBalance);
	}
	
	public void withdraw(int amount)
	{
		if(amount<=bankBalance)
		{
			bankBalance-=amount;
			System.out.println("Sucessfully Withdraw");
			System.out.println("balance :"+ bankBalance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void transfer(int amount, String toAccountNo)
	{
		int otp = OtpGenerator.generateOtp();
		System.out.println("OTP :"+otp);
		System.out.println("Please Fill OTP: ");
		Scanner sc = new Scanner(System.in);
		int inputOtp = Integer.parseInt(sc.nextLine());
				if(inputOtp==otp)
				{
					if(amount<=bankBalance)
					{
						bankBalance-=amount;
						System.out.println("Sucessfully Transfered Rs."+ amount +" to "+ toAccountNo);
						System.out.println("balance :"+ bankBalance);
					}
					else {
						System.out.println("Insufficient Balance");
					}
					
				}else {
					System.out.println("Invalid OTP!!!!");
				}
				
	}
}
