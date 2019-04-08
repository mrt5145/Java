package day13_stringmanipulation;

import java.util.Scanner;

public class StartEndWords {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first word:");
	String first=input.next();
	System.out.println("Enter the second word:");
	String second=input.next();
	char one = first.charAt(4);
	char two = second.charAt(0);
	int a =first.length();
	int b=second.length();
	if(a!=5 || b!=5) {
		System.out.println("Need to be exactly 5 chars length.");
	}
	else
	{
		if(one==two)
		{
			System.out.println("Fizzzzz");
		}
		else      
		{
			System.out.println("Buzz- did not match");
		}
	}
}
}
