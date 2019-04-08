package day8_conditionals2;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your bach number : ");
	int bach=input.nextInt();
	if(bach==10)
	{
		System.out.println("we are class mates!");
	}
	else
	{
		System.out.println("we arent class mates!");
	}
	
	System.out.println("---------------------------------------------------------------");
	int pincode=27;
	System.out.println("enter the pin code");
	int pincode1=input.nextInt();
	if(pincode==pincode1)
	{
		System.out.println("access granted");
	}
	else
	{
		System.out.println("denied!");
	}
	System.out.println("---------------------------------------------------------------");
	System.out.println("enter a number");
	int number=input.nextInt();
	if(number%2==0)
	{
		System.out.println("its an even number");
	}
	else {
		System.out.println("its an odd number");
	}
	}

}
