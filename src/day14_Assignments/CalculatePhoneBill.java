package day14_Assignments;

import java.util.Scanner;

public class CalculatePhoneBill {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number of calls");
	int calls=input.nextInt();
	double bill;
	int morethan100;
	if (calls<=100)
	{
		bill=200;
	}
	else if (calls>100 && calls<=150)
	{
		morethan100=calls-100;
		bill=200+(morethan100*0.6);
	}
	else if (calls>150 && calls<=200)
	{
		morethan100=calls-100;
		int morethan150=morethan100-50;
		bill=200+(morethan150*0.5)+(50*0.6);
	}
	else
	{
		int morethan200=calls-200;
		bill=200+(50*0.5)+(50*0.6)+(morethan200*0.4);
	}
	
	System.out.println("Your Bill is: " + bill);
}
}
