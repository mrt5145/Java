package day14_stringManipulation_cont;

import java.util.Scanner;

public class AddThings {
	public static void main(String[] args) {
		String domain="@cybertekschool.edu.usa";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your user name");
		String username=input.next();
		System.out.println("Your Email address is : ");
		System.out.println(username.concat(domain));
		
	}
}
