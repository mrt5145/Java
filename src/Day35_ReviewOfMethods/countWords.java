package Day35_ReviewOfMethods;

import java.util.Arrays;
import java.util.Scanner;

public class countWords {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str= input.nextLine();
		CountWords(str);
	}
	
	public static void CountWords(String str)
	{
		String[] splitedarr=str.split(" ");

		String splited=Arrays.toString(splitedarr);
		System.out.println("Word int this string is : "+splited);
		System.out.println("The number of words: " +splitedarr.length);
	
	}
}
