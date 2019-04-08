package day9_conditionals3;

import java.util.Scanner;

public class RushHoursTollCalculater {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance");
		int miles = input.nextInt();
		System.out.println("Is rush hours=");
		boolean rushHours = input.nextBoolean();
		double tollcost = 0;
		if (miles > 0 && miles <= 100) {
			if (rushHours == true) {
				tollcost = 10;
			}

			else {
				tollcost = 5;
			}
		} else if (miles >= 101 && miles <= 500) {
			if (rushHours == true) {
				tollcost = 16;
			} else {
				tollcost = 8;
			}
		} else if (miles >= 501 && miles <= 1000) {
			if (rushHours == true) {
				tollcost = 20;
			} else {
				tollcost = 10;
			}

		} else if (miles < 0) {
			System.out.println("Distance cant be less than 0");
			tollcost = 0;
		} else if (miles == 0) {
			tollcost = 0;
		} else {
			if (rushHours == true) {
				tollcost = 24;
			}

			else {
				tollcost = 12;
			}

		}
		System.out.println("Toll Cost = " + tollcost);
	}
}
