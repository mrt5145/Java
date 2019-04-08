package day33_methodsWithReturn02;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word= input.next();
		String reverse = Reverse(word);
		System.out.println(reverse);
		boolean result = Palindrome("Civic");
		System.out.println("it is palindrome= "+ result);
		result=PalindromeV2("racecar");
		System.out.println("it is palindrome= "+ result);
		result=Palindrome("something");
		System.out.println("it is palindrome= "+ result);
	}
	
	public static String Reverse(String word)
	{
		String reverse="";
		for(int i = word.length()-1; i >=0;i-- )
		{
			reverse=reverse+word.charAt(i);
		}
		return reverse;
				
	}
	
	public static Boolean Palindrome(String word)
	{
		String reversed = Reverse(word.toLowerCase());
		boolean result=(reversed.equals(word.toLowerCase()));
		return result; 
		
		
	}
	public static Boolean PalindromeV2(String word)
	{
		return Reverse(word).equalsIgnoreCase(word);
		
		
	}
}
