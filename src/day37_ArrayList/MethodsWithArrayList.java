package day37_ArrayList;
import java.util.*;

public class MethodsWithArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(100);
		numsList.add(253);
		numsList.add(123);
		numsList.add(4365);
		int result = sum(numsList);
		System.out.println(result);
		
		
		ArrayList<Integer> num1 = new ArrayList<>();
		
		num1.add(342);
		num1.add(3345);
		num1.add(376);
		num1.add(3);
		num1.add(2);
		
		
		ArrayList<Integer> num2 = new ArrayList<>();
		
		num2.add(3672);
		num2.add(345);
		num2.add(37);
		num2.add(321);
		num2.add(27);
		
		result = sum2Lists(num1,num2);
		System.out.println(result);
		
		
		
		System.out.println(buildIntList(50));
		ArrayList<Integer> randomList = buildIntList(500);
		
		System.out.println(sum(buildIntList(500000)));
	}
//	how to write a method that accepts an Arraylist
	public static int sum(ArrayList<Integer> nums)
	{
		int sum=0;
		for(int num : nums)
		{
			sum=sum+num;	
		}
//		for(int i=0; i<nums.size();i++)
//		{
//			sum=sum+nums.get(i);
//		}
		return sum;
	}
	
	public static int sum2Lists(ArrayList<Integer> nums1, ArrayList<Integer> nums2)
	{
		int sum1=0;
		int sum2 = 0;
		for(int num : nums1)
		{
			sum1=sum1+num;	
		}
		for(int i=0; i<nums2.size();i++)
		{
			sum2=sum2+nums2.get(i);
		}
		
		return sum1+sum2;
	}
	
	/* How to write a method that return an ArrayList of integers
	 * method name : buildIntList
	 * Return type : ArrayList of Integer
	 * Args int
	 *  
	 */
	
	public static ArrayList<Integer> buildIntList(int count)
	{
		ArrayList <Integer> returnList = new ArrayList<>();
		Random rand = new Random();
		for ( int i = 0 ; i<count;i++)
		{
			returnList.add(rand.nextInt(101));
		}
		return returnList;
	}
}
