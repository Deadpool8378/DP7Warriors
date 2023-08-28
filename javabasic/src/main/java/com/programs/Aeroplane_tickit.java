package com.programs;

import java.util.Scanner;

public class Aeroplane_tickit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Airplane");
		String airname = sc.next();
		
		
		System.out.println("Name");
		String name=sc.next();
		
		
		System.out.println("Destination");
		String des=sc.next();
		
		
		
		System.out.println("Enter Coupen code");
		int coup=sc.nextInt();
		
		if(coup==12345)
		{
			System.out.println("You have got 10% discount");
			double price=40000;
			double price1=price/100*10;
			System.out.println(price1);
			double price3=price-price1;
			System.out.println("Your final price is Rs"+price3);
			System.out.println("enjoy your journey");
		}
		else {
			System.out.println("no discount");
		}
		
		

	}

}
