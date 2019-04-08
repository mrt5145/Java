package day21_loop4;

import java.util.Scanner;

public class NeighborChars {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=input.nextLine();
		int a =word.length();
		System.out.println(a+" Character");
		for(int i=0; i<a-1; i++)
		{
			if(word.charAt(i)==word.charAt(i+1))
			{
				System.out.println("Beep "+word.charAt(i));
			}
			else
			{
				System.out.println("No Beep");
			}
		}
	}
}
