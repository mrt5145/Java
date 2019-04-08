package day27_Arrays;

import java.util.Scanner;

public class ArraysTasks {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String[] arr= new String[5];
		System.out.println("Enter arrays: ");
		for(int i=0;i<5;i++)
		{
			arr[i]=input.nextLine();
		}
		for(String each : arr)
		{
			System.out.println(each.substring(0,3));
		}
	}
}
