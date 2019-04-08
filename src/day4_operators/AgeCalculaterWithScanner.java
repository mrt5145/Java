package day4_operators;

import java.util.Scanner;//bring scanner class code so that I can use it in my program
//ask user current year, calculate the age and print 
public class AgeCalculaterWithScanner 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in); //creating scanner
		System.out.println("Enter year of birth");
		//let user to enter an int number during execution
		int yearOfBirth = scan.nextInt();
		
		System.out.println("Year of birth is " + yearOfBirth);
		System.out.println("Enter the current year");
		int currentYear= scan.nextInt();
		
		int age=currentYear-yearOfBirth;
		System.out.println("Your age is "+age);
		System.out.println(9/2.0);
		scan.close();
	}
}
