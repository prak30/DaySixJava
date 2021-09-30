package com.daysixjava;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		forPrime(n);
		sc.close();
	}
	
	public static void forPrime(int n)
	{
		for(int i = 2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				System.out.println("not a prime number");
			
			}
			else
			{
				System.out.println("prime number");
			}
		}
	}
}