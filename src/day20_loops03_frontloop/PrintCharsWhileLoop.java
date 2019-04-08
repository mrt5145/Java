package day20_loops03_frontloop;

import java.util.Scanner;

public class PrintCharsWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word=input.next();
		int end=word.length();
		int start=0;
		while(start<end)
		{
			System.out.println(word.charAt(start));
			start++;
		}
	}
}
