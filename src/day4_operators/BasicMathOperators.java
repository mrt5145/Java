package day4_operators;

public class BasicMathOperators {
	public static void main(String[]args)
	{
		int num1=100;
		int num2=200;
		System.out.println(num1+num2);
		System.out.println(num1+num2+1000);
		
		int sum=num1+num2+20;
		System.out.println("Sum is "+sum);
		
		//create 3 variables= apples, carrots, tomatoes
		// add price with decimall
		//create a variable called total and assign total price
		//also print the tax then add the task to the total 
		//print your total is total price with tax
		//6 percent tax
		double apples=10.55;
		double carrots=3.87;
		double tomatoes=6.23;
		
		double totalBeforeTax= apples+ carrots+tomatoes;
		System.out.println("Total Before Tax: "+ totalBeforeTax);
		
		//calculate tax
		double tax= totalBeforeTax*0.06;
		System.out.println("Total Tax: "+ tax);
		double total=totalBeforeTax+tax;
		System.out.println("Total cost is= $"+total);
	}

}
