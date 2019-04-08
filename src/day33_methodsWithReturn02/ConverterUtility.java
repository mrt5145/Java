package day33_methodsWithReturn02;

import java.util.Scanner;

public class ConverterUtility {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the mile : ");
		double mile=input.nextDouble();
		double km=mile2km(mile);
		System.out.println(mile+" Mile = "+ km +" km" );
		if(km<100)
		{
			System.out.println("Speed is good");
		}
		else
		{
			System.out.println("You are fast! Slow down!");
		}
		System.out.println("Enter the Fahrenheit : ");
		int Fh=input.nextInt();
		int Cel=Fh2Cel(Fh);
		
		System.out.println(Fh+" Fahrenheit = "+ Cel +" Celcius" );
		
		if(Cel>=35)
		{
			System.out.println("Weather is too hot! drink lots of water!");
		}
		else if( 15<= Cel && Cel <35)
		{
			System.out.println("The weather is really good!");
		}
		else
		{
			System.out.println("The weather is cold! ");
		}
	}
	
	public static double mile2km(double mile)
	{
		double km= mile*1.6;
		return km;
	}
	public static int Fh2Cel(int Fh)
	{
		int Cel= (Fh-32)*5/9;
		return Cel;
	}
	public static double mile2kmV2(double mile)
	{
		double km= CalculatorV2.multiply(mile,1.6);
		return km;
	}
	
}
