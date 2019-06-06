package com.mine.numbers;

import java.util.Scanner;

public class FactorialOfNumber 
{
	//without using recursion
	public static int fact(int num)
	{
		int res=1;
		
		for (int i = num; i> 0 ; i--)
		{
			res=res*i;
		}
		return res;
	}
	
	//using recursion
	static int out=1;
	public static int recFact(int num)
	{
		if(num>1)
		{
			out=out*num--;
			recFact(num);
		}
		return out;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = s.nextInt();
		s.close();
		System.out.println("Factorial of "+num+" is "+fact(num));
		System.out.println("Factorial of "+num+" is "+recFact(num));
	}
}
