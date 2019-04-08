package day14_Assignments;

import java.util.Scanner;

public class SaleDiscountCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double beforediscount;
		double price;
		double discountamount;
		int discount=0;
		System.out.println("Enter the quantity that you purchased");
		int quantity=input.nextInt();
		System.out.println("Enter the unit price");
		double unitprice=input.nextDouble();
		if(quantity>=100 && quantity<=120)
		{
			discount=10;
		}
		else if(quantity>120)
		{
			discount=15;
		}
		else
		{
			System.out.println("Not enough quantity for discount");
		}
		if(discount>0)
		{
		beforediscount=(unitprice*quantity);
		discountamount=(discount*beforediscount)/100;
		price=beforediscount-discountamount;
		System.out.println("Grand Total: "+ beforediscount);
		System.out.println("Discount percentage= " +discount);
		System.out.println("Discount Applied "+ discountamount);
		System.out.println("Total= "+price);
		
		}
		else
		{
			price=quantity*unitprice;
			System.out.println("Total= "+price);
		}
	}
}
