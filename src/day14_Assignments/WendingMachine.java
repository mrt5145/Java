package day14_Assignments;

import java.util.Scanner;

public class WendingMachine {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the item price:");
	int price=input.nextInt();
	if(price%5!=0)
	{
		System.out.println("Invalid price");
	}
	else
	{
		System.out.println("Enter the money that you give the machine as cent :");
		int money=input.nextInt();
		if(money%100!=0)
		{
			System.out.println("Invalid Money");
		}
		else
		{
			int change=money-price;
			int quarter=change/25;
			change=change-(quarter*25);
			int dimes=change/10;
			change=change-(dimes*10);
			int nickles=change/5;
			System.out.println("Your change is "+ quarter +" quarters, "+dimes+" dimes and " + nickles+ " nickels.");
		}
	}
}
}
