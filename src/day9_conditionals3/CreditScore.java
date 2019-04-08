package day9_conditionals3;

import java.util.Scanner;

public class CreditScore {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("--------------------FICO CREDIT SCORE CHART---------------------------\n");
	System.out.println("Enter your credit score");
	int creditScore=input.nextInt();
	int percentage=0;
	String CreditStatus;
	if(creditScore<0 || creditScore>850 )
	{
		CreditStatus="Invalid Credit Score. Cannot be more than 850 and negative";
	}
	else if(creditScore==0 )
	{
		CreditStatus="No Credit History";
	}
	else if(creditScore >=800 && creditScore<850 )
	{
		CreditStatus="Expectional";
		percentage=20;
		
	}
	else if(creditScore>=740 && creditScore<800 )
	{
		CreditStatus="Very good";
		percentage=25;
	}
	else if(creditScore>=670 && creditScore<740 )
	{
		CreditStatus="Good";
		percentage=21;
	}
	else if(creditScore>=580 && creditScore<670 )
	{
		CreditStatus="fair";
		percentage=18;
	}
	else if(creditScore>=300 && creditScore<580 )
	{
		CreditStatus="Very poor";
		percentage=16;
	}
	else
	{
		CreditStatus="Bad";
	}
	System.out.println(CreditStatus);
	System.out.println("Percentage in USA: "+ percentage);
}
}
