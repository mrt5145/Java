package day28_Array;

import java.util.Scanner;

public class CountEvens {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    int counter=0;
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]%2==0)
	    	{
	    		counter++;
	    	}
	    }
	    System.out.println("Even numbers count = "+counter);
	}
}
