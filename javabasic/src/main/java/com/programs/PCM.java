package com.programs;

import java.util.Scanner;

public class PCM {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pcm number");
		int pmarks = sc.nextInt();
		System.out.println("enter total number");
		int total1=sc.nextInt();
		
		
		
		if(pmarks>=80 ||total1>=90)
		{
			System.out.println("ur are eligible");
			
			
		}
		else
		{
			
			System.out.println("u are not eligible");
		}
		
		
		
			
	}

}
