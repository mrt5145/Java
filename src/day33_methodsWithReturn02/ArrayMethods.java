package day33_methodsWithReturn02;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] myNums=getIntArray();
		System.out.println(Arrays.toString(myNums));
		System.out.println(Arrays.toString(getIntArray()));
		int [] myNums2=getIntArray();
		int sumOfMyNums=sumOfArray(myNums);
		int sumOfMyNums2=sumOfArray(myNums2);
		System.out.println("First Arrays' sum is = "+sumOfMyNums);
		System.out.println("Second Arrays' sum is = "+sumOfMyNums2);
		if(sumOfMyNums>sumOfMyNums2)
		{
			System.out.println("First array > Second Array");
		}
		else if(sumOfMyNums<sumOfMyNums2)
		{
			System.out.println("First array < Second Array");
		}
		else
		{
			System.out.println("They are equal");
		}
		
	}
	
	public static int sumOfArray(int[]arr)
	{
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static int [] getIntArray()
	{
		int[]nums=new int [5];
		Random rand=new Random();
		for (int i = 0; i < 5; i++) {
            //0 ile 99 arasinda rasgele sayi uretip diziye ekliyoruz
            nums[i]=rand.nextInt(101);
             
        }
//		System.out.println(Arrays.toString(nums));
		
//		int[]nums2= {rand.nextInt(101),
//					 rand.nextInt(101),
//					 rand.nextInt(101),
//					 rand.nextInt(101),
//					 rand.nextInt(101)};
//		
//		
//		System.out.println(Arrays.toString(nums2));
		return nums;
	}
}
