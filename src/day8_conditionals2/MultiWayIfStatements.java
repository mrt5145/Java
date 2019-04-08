package day8_conditionals2;

import java.util.Scanner;

public class MultiWayIfStatements {
	public static void main(String[] args) {
		
//	/*	int weekday=1;
//		if(weekday==1)
//		{
//			System.out.println("Monday");
//		}
//		else
//		{
//			System.out.println("It is not Monday");
//		}
//		if(weekday==2)
//		{
//			System.out.println("Tuesday");
//		}
//		else
//		{
//			System.out.println("It is not Tuesday");
//		}if(weekday==3)
//		{
//			System.out.println("Wednesday");
//		}
//		else
//		{
//			System.out.println("It is not Wednesday");
//		}
//		if(weekday==4)
//		{
//			System.out.println("Thursday");
//		}
//		else
//		{
//			System.out.println("It is not Thursday");
//		}
//		if(weekday==5)
//		{
//			System.out.println("Friday");
//		}
//		else
//		{
//			System.out.println("It is not Friday");
//		}if(weekday==6)
//		{
//			System.out.println("Saturday");
//		}
//		else
//		{
//			System.out.println("It is not Saturday");
//		}if(weekday==7)
//		{
//			System.out.println("Sunday");
//		}
//		else
//		{
//			System.out.println("It is not Sunday");
//		}*/
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the day");
		int weekday=input.nextInt();
		weekday=weekday%7;
		if(weekday==1)
		{
			System.out.println("Monday");
		}
		else if(weekday==2)
		{
			System.out.println("Tuesday");
		}
		else if(weekday==3)
		{
			System.out.println("Wednesday");
		}
		else if(weekday==4)
		{
			System.out.println("Thursday");
		}else if(weekday==5)
		{
			System.out.println("Friday");
		}else if(weekday==6)
		{
			System.out.println("Saturday");
		}else if(weekday==7)
		{
			System.out.println("Sunday");
		}
		
	}
}
