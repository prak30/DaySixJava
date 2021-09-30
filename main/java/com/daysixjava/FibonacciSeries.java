package com.daysixjava;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		seriesFibonaci(n);
		sc.close();
	}
	
	public static void seriesFibonaci(int n)
	{
		int preNumber = 0;
		int nextNumber = 1;
		int i = 1;
		System.out.println("fibonacci series of " +n);
		while(i<=n){
			{
				int sum = preNumber + nextNumber;
	            preNumber = nextNumber;
	            nextNumber = sum;
	            i++;
	            System.out.println( +sum);
			}
		}
	}

}
