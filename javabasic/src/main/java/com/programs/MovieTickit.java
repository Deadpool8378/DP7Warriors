package com.programs;

import java.util.*;

public class MovieTickit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of movie");
		String movie = sc.next();
		System.out.println("Enter rating");
		double rating = sc.nextDouble();
		System.out.println("prize is Rs300");

		System.out.println("Enter Coupen code");
		int coup = sc.nextInt();
		Date dt= new Date();

		if (coup == 0) {
			System.out.println("you have got Rs50 discount");
			double prize = 300;
			double prize1 = prize - 50;
			System.out.println("prize is Rs250");
		} else if (coup == 1) {
			System.out.println("you have got Rs 100 discount");
			double prize = 300;
			double prize1 = prize - 100;
			System.out.println("prize is Rs200");

		}

		else {
			System.out.println("Prize is Rs 300");
		}
		System.out.println("You booked tickit on " +dt);
	}
	

}
