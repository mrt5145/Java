package day13_stringmanipulation;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String userName="admin";
		String password="abc123";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String inputusername=input.next();
		if(inputusername.equalsIgnoreCase(userName))
		{
			System.out.println("Please enter the password");
			String inputpassword=input.next();
			if(inputpassword.equals(password))
			{
				System.out.println("Login Succesfull");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid User Name");
		}
		boolean b=inputusername.equalsIgnoreCase(userName);
		System.out.println(b);
		
	}
}
