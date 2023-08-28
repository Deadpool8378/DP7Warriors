package com.programs;
import java.util.Scanner;
public class Bank {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int pin=1234;
		double balance= 10000;
		System.out.println("Enter ATM Pin");
		int pin1 = sc.nextInt();
		
		if(pin==pin1) {
			
		
			System.out.println("1 Deposite");
		System.out.println("2 Withdraw");
		System.out.println("3 View Balance");
		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		
		if(choice==1)
		{
			System.out.println("Enter your deposite");
			double dep = sc.nextDouble();
			System.out.println("New balance is " +(balance+=dep));
			
			
		}
		if(choice==2)
		{
			System.out.println("Enter your withdrawl amount");
			double wtd = sc.nextDouble();
			System.out.println("New balance is " +(balance-=wtd));
			
			
		}
		if(choice==3)
		{
			
			System.out.println("Your available balance is " +balance);
			
			
		}
		}
		else
		{
		
			
				System.out.println("Pin is not correct");
				
			
				
				
			}
		}
		
		
	}


