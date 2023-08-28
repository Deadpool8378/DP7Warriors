package com.programs;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int number = sc.nextInt();
		System.out.println("Enter factor");
		int factor = sc.nextInt();

		if (number % factor == 0) {
			System.out.println(factor + "is a factor" + number);
		} else {
			System.out.println(factor +  "  is not a factorial of  "  + number);

		}
	}
}
