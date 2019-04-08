package day32_methodswithReturn;

import java.util.Scanner;

public class MethodsWithParameters {
	public static void main(String[] args) {
		String Email= email("Murat","Tuter");
		System.out.println(Email);
		System.out.println(email("melike","tuter"));
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first and last name");
		String name=input.next();
		String lastName=input.next();
		System.out.println(email(name,lastName));
		System.out.println("Enter the two number that you want to compare: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Largest number is : " + max(num1,num2));
		int maxNumber= max3(15,15,11);
		System.out.println("Max number is : " + maxNumber);
		System.out.println("Enter the day");
		System.out.println(isValidDay(input.next()));
		
	}
	
	public static String email(String name, String lastname)
	{
		String email = name+"_"+lastname+"@gmail.com";
		return email;
	}
	
	public static int max(int num1, int num2)
	{
		if(num1<num2)
		{
			return num2;
		}
		else
		{
			return num1;
		}
	}
	public static int max3(int num1,int num2,int num3)
	{
		if(num1>=num2 && num1>=num3)
		{
			return num1;
		}
		else if (num2>=num1 && num2>=num3)
		{
			return num2;
		}
		else
		{
			return num3;
		}
	}
	public static boolean isValidDay(String day)
	{
//		day= day.toLowerCase().trim();
//		if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")||
//				day.equals("saturday")||day.equals("sunday"))
//		{
//			return true;
//		}
//		
//		return false;
		
		day= day.toLowerCase().trim();
		if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")||
				day.equals("saturday")||day.equals("sunday"))
		{
			return true;
		}
		else {
		return false;
		}
		
//		return(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")||
//				day.equals("saturday")||day.equals("sunday"));
	}
}
