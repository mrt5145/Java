package day9_conditionals3;

import java.util.Scanner;

public class ShippingCalculater {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the purchase price : ");
		double purchaseprice = input.nextDouble();
		System.out.println("Choose the Spipping type\n" + "1.Regular Shipping\n" + "2.Express Shipping");
		int shippingtype = input.nextInt();
		double shippingcost = 0;
		if (purchaseprice >= 1 && purchaseprice <= 100) {
			if (shippingtype == 1) {
				shippingcost = 17;
			} else if (shippingtype == 2) {
				shippingcost = 35;
			} else {
				System.out.println("Enter Valid information");

			}
		} else if (purchaseprice >= 101 && purchaseprice <= 300) {
			if (shippingtype == 1) {
				shippingcost = 10;
			} else if (shippingtype == 2) {
				shippingcost = 25;
			} else {
				System.out.println("Enter Valid information");

			}
		} else if (purchaseprice >= 301) {
			if (shippingtype == 1) {
				shippingcost = 0;
			} else if (shippingtype == 2) {
				shippingcost = 15;
			} else {
				System.out.println("Enter Valid information");

			}
		} else {
			System.out.println("Enter Valid information");

		}

		System.out.println("Shipping Cost = " + shippingcost);
	}
}
