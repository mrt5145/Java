package day36_Overloading;

import java.util.ArrayList;

public class WrapperArrayListValues {
	public static void main(String[] args) {
//		Must use like that : 
//		byte    -> Byte
//		short   -> Short
//		int     -> Integer
//		long    -> Long
//		float   -> Float
//		double  -> Double
//		char    -> Character
//		boolean -> Boolean
		Integer num1 = 100;
		Integer num2 = 100;
		
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(123);
		nums.add(453);
		nums.add(5145);
		nums.add(1283);
		nums.add(5156);
		System.out.println(nums);
		for(Integer num : nums)
		{
			System.out.println(num);
		}
		
		System.out.println("--------------------");
		
		for(int num : nums)
		{
			System.out.println(num);
		}
		System.out.println("--------------------");
		
		for(int i = 0 ; i<nums.size();i++)
		{
			System.out.println(nums.get(i));
		}
	}
}
