package com.programs;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the week day from 1 - 7");
		Scanner sc= new Scanner(System.in);
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1 : System.out.println("Monday");
				break;
		case 2 : System.out.println("Tueday");
		break;
		case 3 : System.out.println("Wedday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default : System.out.println("Error");
		}
		System.out.println("Enjoy your Day");
	}

}
