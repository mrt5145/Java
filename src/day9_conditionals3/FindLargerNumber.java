package day9_conditionals3;

import java.util.Scanner;

public class FindLargerNumber {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a ");
		int a=input.nextInt();
		System.out.println("Enter b ");
		int b=input.nextInt();
		int max;
		if(a<b)
		{
			max=b;
		}
		else if(a>b)
		{
			max=a;
		}
		else
		{
			a=b;
			max=b;
		}
		System.out.println("Max= "+ max);
		System.out.println("Enter num1 ");
		int num1=input.nextInt();
		System.out.println("Enter num2 ");
		int num2=input.nextInt();
		System.out.println("Enter num3 ");
		int num3=input.nextInt();
		int max2;
		if(num1>num2 && num1>num3)
		{
			max2=num1;
		}
		else if(num2>num1 && num2>num3)
		{
			max2=num2;
		}
		else if(num3>num1 && num3>num2)
		{
			max2=num3;
		}
		else if(num1==num2 && num1>num3)
		{
			max2=num1;
		}
		else if(num1==num2 && num1<num3)
		{
			max2=num3;
		}
		else if(num1==num3 && num1>num2)
		{
			max2=num1;
		}
		else if(num1==num3 && num1<num2)
		{
			max2=num2;
		}
		else if(num2==num3 && num2>num1)
		{
			max2=num2;
		}
		else if(num2==num3 && num2<num1)
		{
			max2=num1;
		}
		else
		{
			num1=num2;
			num3=num2;
			max2=num2;
		}
		System.out.println("max2 = "+ max2);
//		if(num1>num2)
//		{
//			if(num1>num3)
//			{
//				max2=num1;
//			}
//			else
//			{
//				max2=num3;
//			}
//		}
//		else if(num1<num2)
//		{
//			if(num2>num3)
//			{
//				max2=num2;
//			}
//			else
//			{
//				max2=num3;
//			}
//		}
//		else
//		{
//			num1=num2;
//			num3=num2;
//			max2=num3;
//		}
//		
//		if(num1 >= num2 && num1 >= num3) {
//		max = num1;
//	}else if(num2 >= num1 && num2 >= num3) {
//		max = num2;
//	}else {
//		max = num3;
//	}
	
//	if(num1 > num2 && num1 > num3) {
//		max = num1;
//	}else if(num2 > num3) {
//		max = num2;
//	}else {
//		max = num3;
//	}
		
	}
	
}
