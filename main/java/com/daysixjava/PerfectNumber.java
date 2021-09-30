package com.daysixjava;

import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number you want to check");
		int n = sc.nextInt();
		checkNum(n);
		sc.close();
	}
	public static void checkNum(int n)
	{
		int sum = 0;
		for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("entered number "+n+" is Perfect number");
        }
        else
        {
            System.out.println("entered number "+n+"is not Perfect number");
        }    
	}


}
