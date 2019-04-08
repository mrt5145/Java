package Day35_ReviewOfMethods;

import java.util.Scanner;

public class loginWithMethods {
//	public static void main(String[] args) {
//		Scanner input= new Scanner(System.in);
//		System.out.println("Enter your id: ");
//		String scannedID=input.next();
//		System.out.println("Enter your password: ");
//		String scannedPassword=input.next();
//		login(scannedID,scannedPassword);
//	}
//
//	public static void login(String scannedID, String scannedPassword)
//	{
//		String id="mrt5145";
//		String password="20095145";
//		
//		if(scannedID.equals(id)&&scannedPassword.equals(password))
//		{
//			System.out.println("Login Successful!");
//		}
//		else if(scannedID.equals(id))
//		{
//			System.out.println("Invalid Password!");
//		}
//		else if(scannedPassword.equals(password))
//		{
//			System.out.println("Invalid Id!");
//		}
//		else
//		{
//			System.out.println("ID and Password are invalid!");
//		}
//	}
	
	public static void main(String[] args) {
		login();
	}

	public static void login()
	{
		String id="mrt5145";
		String password="20095145";
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your id: ");
		String scannedID=input.next();
		System.out.println("Enter your password: ");
		String scannedPassword=input.next();
		if(scannedID.equals(id)&&scannedPassword.equals(password))
		{
			System.out.println("Login Successful!");
		}
		else if(scannedID.equals(id))
		{
			System.out.println("Invalid Password!");
		}
		else if(scannedPassword.equals(password))
		{
			System.out.println("Invalid Id!");
		}
		else
		{
			System.out.println("ID and Password are invalid!");
		}
	}
}
