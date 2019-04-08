package day20_loops03_frontloop;

import java.util.Scanner;

public class Day20WarmUpTask {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 2 number");
	int start=input.nextInt();
	int end=input.nextInt();
	if(start < end)
	{
		System.out.println("LOOPING FORWARD");
		while(start<=end)
		{
			System.out.println("Step " + start);
			start++;
			
		}
	}
	else if(start>end)
	{
		System.out.println("LOOPING BACKWARDS");
		while(start>=end)
		{
			System.out.println("Step " + start);
			start--;
		}
	}
	else
	{
		System.out.println("Start and End are Equal");
	}
}
}
