package day36_Overloading;

import java.util.Arrays;

public class SumOfArray {
	
	public static void main(String[] args) {
		int[] arr1= {13,43,5,6,76};
		int[] arr2= {43,53,15,26,6};
		System.out.println(Arrays.toString(addElements(arr1,arr2)));
		
	}
	
	
	

	public static int[] addElements(int[]arr1, int[] arr2)
	{
		int[]sum=new int[arr1.length];
		for(int i = 0 ; i<arr1.length;i++)
		{
			sum[i]=arr1[i]+arr2[i];
		}
		
		return sum;
	}
}
