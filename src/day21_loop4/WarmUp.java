package day21_loop4;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=input.nextLine();
		String unique="";
//		int i = word.length()-1;
//		System.out.println(word.substring(i, i+1));
		for(int i = 0; i<word.length(); i++)
		{
			String letter=word.substring(i, i+1);
			if(!unique.contains(letter))
			{
				unique=unique+letter;
			}
		}
		System.out.println(unique);
	}

}
