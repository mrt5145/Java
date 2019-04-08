package day21_loop4;

import java.util.Scanner;

public class WarmUp2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the word");
	
	String word=input.nextLine().toLowerCase();
	System.out.println("Enter the Char that you want to searh at word");
	char ch=input.next().charAt(0);
	int counter = 0;
	for(int i = 0; i<word.length(); i++)
	{
		//System.out.println(word.charAt(i));
		if(word.charAt(i)==ch)
		{
			counter++;
		}
	}
	System.out.println("Found "+ch+" " + counter +" times");
}
}
