package day28_Array;

import java.util.Scanner;

public class SplitEmail {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your Email");
		String email=input.nextLine();
		if(email.contains("@"))
		{
		String[] arr=email.split("@");
		if(arr.length==2)
		{
			System.out.println("Email id: "+arr[0]);
			System.out.println("Email domain: "+arr[1]);
		}
		else
		{
			System.out.println("invalid email");
		}
		}
		else
		{
			System.out.println("invalid email");
		}
	}
}
