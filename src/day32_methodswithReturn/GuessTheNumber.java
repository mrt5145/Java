package day32_methodswithReturn;

import java.util.Random;

public class GuessTheNumber {
	public static void main(String[] args) {
		
//		playGuessNumComputerOnly();
		playGuessNumWitLimit(10);
	
	}
	public static void playGuessNumComputerOnly()
	{
		Random random= new Random();
		int secretNumber = random.nextInt(21);
		int guessNumber;
		int counter=0;
		do {
			counter++;
			System.out.println("Guess the Secret number:");
			guessNumber=random.nextInt(21);
			System.out.println("Guessing : "+ guessNumber+ " Counter : "+ counter);
			
			if(guessNumber==secretNumber)
			{
				System.out.println("You Won! Guessed the Secret Number!");
				break;
			}
			else {
				System.out.println("Wrong Try Again!");
			}
		}while(true);
	}
	public static void playGuessNumWitLimit(int limit)
	{
		Random random= new Random();
		int secretNumber = random.nextInt(21);
		int guessNumber;
		int counter=0;
		do {
			counter++;
			System.out.println("Guess the Secret number:");
			guessNumber=random.nextInt(21);
			System.out.println("Guessing : "+ guessNumber+ " Counter : "+ counter);
			
			
			if(guessNumber==secretNumber)
			{
				System.out.println("You Won! Guessed the Secret Number!");
				break;
			}
			else {
				System.out.println("Wrong Try Again!");
			}
			if(counter==limit)
			{
				System.out.println("You lost! No more try!");
				break;
			}
		}while(true);
	}
	public static void playGuessNumComputerVsMe()
	{
		
	}
	
	public static void sayHi()
	{
		System.out.println(1234);
		System.out.println("Hello");
		System.out.println(true);
		
	}
}
