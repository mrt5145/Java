package day6_operators_boolean;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the current mileage");
		int curmileage= input.nextInt();
		System.out.println("Enter the previous mileage");
		int premileage=input.nextInt();
		System.out.println("enter how many gallon did you add");
		double gallon=input.nextDouble();
		System.out.println("Enter the price of per gallon");
		double price=input.nextDouble();
		double MPG=(curmileage-premileage)/gallon;
		double expenses=gallon*price;
		System.out.println("MPG= "+ MPG);
		System.out.println("Your fill expense= " + expenses );
		
		}
}
