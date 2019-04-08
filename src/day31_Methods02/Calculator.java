package day31_Methods02;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Choose one of the operation "
				+ "\n 1-Add"
				+ "\n 2-Substract"
				+ "\n 3-Multiply"
				+ "\n 4-Divide");
		int a=input.nextInt();
		System.out.println("Enter the number that you want to use");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		if(a==1)
		{
			add(num1,num2);
		}
		else if(a==2)
		{
			substract(num1,num2);
		}
		else if(a==4)
		{
			divide(num1,num2);
		}
		else if(a==3)
		{
			multiply(num1,num2);
		}
		else {
			System.out.println("choose valid operation");
		}
//		add(2,8);
//		substract(156,13);
//		multiply(8,12);
//		divide(156,8);
	}
	public static void add(double num1,double num2)
	{
		System.out.println("Adding of "+ num1 +" and "+num2 +" is "+ (num1+num2) );
	}
	public static void substract(double num1,double num2)
	{
		System.out.println("Substract of "+ num1 +" and "+num2 +" is "+ (num1-num2) );
	}
	public static void multiply(double num1,double num2)
	{
		System.out.println("Multiply of "+ num1 +" and "+num2 +" is "+ (num1*num2) );
	}
	public static void divide(double num1,double num2)
	{
		if(num2==0)
		{
			System.out.println(" ERROR: " +num1+" Cannot divide by 0");
		}
		else {
		System.out.println("Divide of "+ num1 +" and "+num2 +" is "+ (num1/num2) );
		}
	}
	
}
