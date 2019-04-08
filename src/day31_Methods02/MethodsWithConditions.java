package day31_Methods02;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithConditions {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the 2 numbers that you want to compare");
		int num1=input.nextInt();
		int num2=input.nextInt();
		compare(num1,num2);
		
		getMAx( new int [] {13,324,435,7657,678,435,234,235,645645,234,543345,123});
		int [] arr={13,324,435,7657,678,435,234,2312345,645645,234,543345,123};
		GetMAX(arr);
		int [] arr2= new int [] {};
		getMAx(arr2);
		
		System.out.println("Enter a number");
		int number1=input.nextInt();
		steps(number1);
		steps(0);
		steps(-5);
		steps(7);
	}
	public static void compare(int num1, int num2)
	{
		if(num1>num2)
		{
			System.out.println(num1+ " is larger than "+ num2);
		}
		else if(num1<num2)
		{
			System.out.println(num2+ " is larger than "+ num1);
		}
		else {
			System.out.println("They are equal");
		}
	}
	public static void getMAx(int[]nums)
	{
		
		if(nums.length==0)
		{
			System.out.println("ERROR : The Array is empty");
			return;
		}
		
		else
		{
			int a=nums[0];
			for(int i=0; i<nums.length-1;i++)
			{
				if(a>nums[i+1])
				{
//					a=a;
				}
				else
				{
					a=nums[i+1];
				}
			}
			System.out.println("Max number at that array is : "+ a );
		}
	}
	
	public static void GetMAX(int[]nums)
	{
		if(nums.length==0)
		{
			System.out.println("ERROR : The Array is empty");
			return;
		}
		else
		{
			Arrays.sort(nums);
			System.out.println("Max number at that array is : "+ nums[nums.length-1] );
		}
	}
	public static void steps(int num1)
	{
		if(num1<0)
		{
			num1=num1*(-1);
			for(int i=0;i<num1;i++)
			{
				System.out.println("Jump "+ (i+1));
			}
		}
		else if(num1>0)
		{
			for(int i=0;i<num1;i++)
			{
				System.out.println("Step "+ (i+1));
			}
		}
		else
		{
			System.out.println("Sit!");
		}
	}
}
