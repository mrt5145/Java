package day5_operators;

import java.util.Scanner;

public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int FirstNumber=input.nextInt();
		System.out.println("Enter second number: ");
		int SecondNumber=input.nextInt();
		System.out.println("Enter third number: ");
		int ThirdNumber=input.nextInt();
		
		int Sum=FirstNumber+SecondNumber+ThirdNumber;
		System.out.println("Sum of 3 numbers is = "+ Sum);
		input.close();
		
	}

}
