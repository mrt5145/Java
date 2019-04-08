package day28_Array;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] nums= {3,234,534,-6,-5,76,8,7,9,89,5,6,34,-34,};
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		Arrays.sort(nums);
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		String[] names= {"Said","Murat","Hasan","Caner","Ömer","Melike","Gülcan"};
		Arrays.sort(names);
		
		for(int i = 0; i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		System.out.println();
		
		char[] ch= {'a','k','s','o','2','T','7'};
		
		Arrays.sort(ch,0,4);
		for(int i = 0; i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		Arrays.sort(ch);
		for(int i = 0; i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		
	}
}
