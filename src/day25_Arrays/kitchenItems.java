package day25_Arrays;

import java.util.Scanner;

public class kitchenItems {
	public static void main(String[] args) {
		
		System.out.println("\tWelcome!!!");
		String[] items= {"knife","wooden spoon","plates","cups","forks","pan","pot","trash can","fridge","dishwasher"};
		Scanner input=new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.println("\t"+items[i]);
		}
		String ch1="yes";
		while(ch1.equals("yes")) {
		System.out.println("\nChoose one of the item\n");
		
		String item=input.nextLine();
		
		switch(item)
		{
		case "knife":
			System.out.println("Using for cutting foods");
			break;
		case "wooden spoon":
			System.out.println("Using for mixing while you are cooking");
			break;
		case "plates":
			System.out.println("Using for serving the food");
			break;
		case "cups":
			System.out.println("Using for drinking something");
			break;
		case "forks":
			System.out.println("Using for eating");
			break;
		case "pan":
			System.out.println("Using for cooking");
			break;
		case "pot":
			System.out.println("Using for cooking");
			break;
		case "trash can":
			System.out.println("Using for throw away the trashes");
			break;
		case "fridge":
			System.out.println("Using for keep foods cold and fresh");
			break;
		case "dishwasher":
			System.out.println("Using for cleaning dishes");
			break;
		default:
			System.out.println("Please enter valid item");
		}
		item="";
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("Would you like to continue?");
		ch1=input.next();
		}
		System.out.println("\nHave a nice day!");
	}
}
