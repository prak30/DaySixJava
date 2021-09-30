package com.daysixjava;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to be reversed");
		int n = sc.nextInt();
		forReverse(n);
		sc.close();
	
	}
	
	public static void forReverse(int n)
	{
		System.out.println("the reverse is:");
		int rev = 0;
		while(n>0)
		{
			
			int rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;	
		}
		System.out.println(+rev);
	
	}
}
