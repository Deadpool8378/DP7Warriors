package com.programs;


	import java.util.Scanner;
	public class Vowels {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Character :");
			char ch=sc.next().charAt(0);
			
			if(ch=='a' ||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				System.out.println("the given Character is Vowel");
				
			}
			else
			{
				System.out.println("the given Character is Consonant");
				
			}

		}

	}

