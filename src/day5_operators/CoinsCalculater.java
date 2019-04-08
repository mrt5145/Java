package day5_operators;

import java.util.Scanner;

public class CoinsCalculater {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter count of pennies that you have:");
		int pennies=keyboard.nextInt();
		int dollars,quarters,dimes,nickles,penniesLeft;
		dollars=pennies/100;
		penniesLeft=pennies%100;
		quarters=penniesLeft/25;
		penniesLeft=penniesLeft%25;
		dimes=penniesLeft/10;
		penniesLeft=penniesLeft%10;
		nickles=penniesLeft/5;
		penniesLeft=penniesLeft%5;
		pennies=penniesLeft;
		System.out.println("Dollars= "+dollars);
		System.out.println("Quarters= "+quarters);
		System.out.println("Dimes= "+dimes);
		System.out.println("Nickles= "+nickles);
		System.out.println("Pennies= "+pennies );
		System.out.println(4+3);
	}
}
