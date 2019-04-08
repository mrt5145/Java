package Day35_ReviewOfMethods;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word that you want to check is it palindrome or not: " );
		String word = input.next();
		System.out.println(palindrome(word));
		
	}
	
	public static boolean palindrome(String word)
	{
		String reversed= "";
		for(int i = word.length()-1;i>=0;i--)
		{
			reversed=reversed+word.charAt(i);
		}
		
		return (reversed.equals(word));
	}
}
