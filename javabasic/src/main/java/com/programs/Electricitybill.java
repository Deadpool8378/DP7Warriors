package com.programs;
import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter bill units");
		double units= sc.nextDouble();
		double bill=0;
		
		
		if(units<=50)
		{
		 bill=(units*0.5);
			System.out.println("your bill is Rs : "+bill);
		}
		else if(units<150 )
		{
			 bill=(50*0.5) +(units-50)*0.75;
			System.out.println("your bill is Rs : "+bill);
			
		}
		
		else if(units<250)
		{
			 bill=(50*0.5)+(100*0.75)+(units-150)*1.2;
			System.out.println("your bill is Rs : "+bill);

		}
		
		else if (units>250)
		{
			 bill=(50*0.5)+(100*0.75)+(100*1.2)+(units-250)*1.5;
			
			System.out.println("your bill is Rs : "+bill);

			

		}
		System.out.println("your bill is charged with 20% extra ");
		 bill=bill+0.2*bill;
		System.out.println("your bill is Rs : "+bill);
		

			
		
		}
	}


