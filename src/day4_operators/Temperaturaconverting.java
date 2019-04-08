
package day4_operators;

import java.util.Scanner;

public class Temperaturaconverting {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fahrenheit");
		double fahrenheit = scan.nextDouble();
		double celsius=(5/9.0)*(fahrenheit-32);
		System.out.println("Temperature is "+celsius+" celsius");
	}

}
