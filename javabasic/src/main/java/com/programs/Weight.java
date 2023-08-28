package com.programs;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter weight");
		int weight = sc.nextInt();
		
		if (age>=18)
			
		{
			if(weight>=70)
				
			{
				System.out.println("donate blood");
			}
			else
			{
				System.out.println("under weight");
			}
		}
		else {
			System.out.println("not eligible");
		}
	}

}
