package day6_operators_boolean;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the mileage:");
	double mileage=input.nextDouble();
	double km=(1.6*mileage);
	System.out.println(mileage+ " mile = "+ km+ " km");
	System.out.println("Enter the current mileage");
	int curmileage= input.nextInt();
	System.out.println("Enter the previous mileage");
	int premileage=input.nextInt();
	System.out.println("enter how many gallon did you add");
	int gallon=input.nextInt();
	System.out.println("Enter the price of per gallon");
	double price=input.nextDouble();
	double MPG=(curmileage-premileage)/gallon;
	double expenses=gallon*price;
	System.out.println("MPG= "+ MPG);
	System.out.println("Your fill expense= " + expenses );
	
	}
}
