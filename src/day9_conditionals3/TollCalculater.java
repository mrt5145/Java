package day9_conditionals3;

import java.util.Scanner;

public class TollCalculater {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the mile:");
		double mile = input.nextDouble();
		double cost;
		if (mile>0 && mile<=100)
		{
			cost=5;
		}
		else if(mile >= 101 && mile<=500)
		{
			cost=8;
		}
		else if(mile >= 501 && mile<=1000)
		{
			cost=10;
		}
		else if(mile<0)
		{
			System.out.println("Distance cant be less than 0");
			cost=0;
		}
		else if(mile==0)
		{
			cost=0;
		}
		else 
		{
			cost=12;
		}
		System.out.println("Toll Cost = " + cost);
	}
}
