package day21_loop4;

import java.util.Scanner;

public class WarmUp1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word");
	String word=input.next();
	String reversed = "";
	for(int baslangic=word.length()-1; baslangic>=0; baslangic--)
	{
		reversed+=word.charAt(baslangic);
	}
	System.out.println("Reversed word: "+reversed);
	if(word.equalsIgnoreCase(reversed))
	{
		System.out.println("palindrome word!");
	}
	else
	{
		System.out.println("Not a palindrome word!");
	}
}
}
