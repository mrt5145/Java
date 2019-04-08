package day33_methodsWithReturn02;

import day31_Methods02.Calculator;

public class CompareCalculators {
	public static void main(String[] args) {
		Calculator.add(50,4);
		System.out.println(CalculatorV2.calculate(34, 17, '/'));
		double result = CalculatorV2.add(3, 11);
		if(result==14)
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
}
