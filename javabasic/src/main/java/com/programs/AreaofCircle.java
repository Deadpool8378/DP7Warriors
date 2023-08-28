package com.programs;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ab = new Scanner(System.in);
		double pi = 3.14, radius, perimeter, area;
		System.out.println("Enter the radius:");
		radius = ab.nextDouble();
		area = pi * radius * radius;
		perimeter = 2 * pi * radius * radius;

		System.out.println("Area of circle is :" + area);
		System.out.println("Perimeter of circle is :" + perimeter);
	}

}
