package com.programs;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		
		
		
		if((num1>num2) &&(num1>3))
		{
			System.out.println(num1+" is greater");
		}
		else
			if(num2>num3)
				
		{
			System.out.println(num2+" is greater");	
		}
		
			else
			{
				System.out.println("num3 is greater");
				
			}
	}


}


