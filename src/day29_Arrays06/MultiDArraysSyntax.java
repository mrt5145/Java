package day29_Arrays06;

import java.util.Arrays;

public class MultiDArraysSyntax {
	public static void main(String[] args) {
		double[][] prices = new double[3][];
		prices[0]=new double[] {12.3,45.23,234.2,23,1};
		prices[1]=new double[] {1.3,5.23,24.2,27,1};
		prices[2]=new double[5];
		prices[2][0]=2334.45;
		prices[2][1]=27;
		prices[2][3]=245.3;
		prices[2][4]=54.2;
		System.out.println(Arrays.toString(prices[0]));
		System.out.println(Arrays.toString(prices[1]));
		System.out.println(Arrays.toString(prices[02]));
		
		System.out.println(Arrays.deepToString(prices));
	}
}
