package day12_classobject_string;

import java.util.Scanner;

public class GetBeverage {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		double price=0;
		System.out.println("Choose drink type\n"
				+ "Tea\n"
				+ "Coffee\n"
				+ "Water\n"
				+ "Juice\n");
		String drink=input.next();
		
		switch(drink)
		{
		case "Tea":
			price=3;
			break;
		case "Toffee":
			price=4.0;
			break;
		case "Water":
			price=2;
			break;
		case "Juice":
			price=5;
			break;
		default:
			System.out.println("Invalid Drink");
			break;
		}
		System.out.println(drink+" is $"+ price);
	}
}
//package day_12_java;
//
//import java.util.Scanner;
//
//public class GetBeverage {
//
//	public static void main(String[] args) {
//		/*
//		 * tea --> $3
//		 * 
//		 * coffee --> $4
//		 * 
//		 * water -- > $2
//		 * 
//		 * juice -- > $5
//		 *
//		 *
//		 *String drink;
//		 *
//		 *double price;
//		 */
//
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please Enter The Drink Name");
//		String drink = scan.next();
//		
//		double price = 0.0;
//		
//		switch(drink) {
//		case "Tea":
//			price = 3.00;
//		
//			break;
//		case "coffee":
//			price = 4.00;
//			
//			break;
//		case "water":
//			price = 2.00;
//			break;
//		case"juice":
//			price = 5.00;
//			break;
//			default:
//				System.out.println("we have only 4 options");
//			
//		}
//		System.out.println("Your total price is: $" + price);
//		scan.close();
//		
//	}
//
//}