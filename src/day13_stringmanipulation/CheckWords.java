package day13_stringmanipulation;

import java.util.Scanner;

public class CheckWords {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the first word:");
	String first=input.next();
	System.out.println("Enter the second word:");
	String second=input.next();
	System.out.println("Enter the third word:");
	String third=input.next();
	int a=first.length();
	int b=second.length();
	int c = third.length();
	if(a==b)
	{
		if(a==c)
		{
			System.out.println("All words are same length");
		}
		else
		{
			System.out.println("Not same nor different lengths");
		}
	}
	else if(a==c)
	{
		if(a==b)
		{
			System.out.println("All words are same length");
		}
		else
		{
			System.out.println("Not same nor different lengths");
		}
	}
	else if(b==c)
	{
		if(a==c)
		{
			System.out.println("All words are same length");
		}
		else
		{
			System.out.println("Not same nor different lengths");
		}
	}
	else
	{
		System.out.println("All different length");
	}
}
}
