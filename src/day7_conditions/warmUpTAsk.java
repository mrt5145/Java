package day7_conditions;

import java.util.Scanner;

public class warmUpTAsk {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Dolar Amount: ");
		double dolar=input.nextDouble();
		double TL = dolar*6.559;
		//double dolar= TL*0.1518;
		System.out.println(dolar+ " dolar = " +TL + " turkish Liras");
	}
}
