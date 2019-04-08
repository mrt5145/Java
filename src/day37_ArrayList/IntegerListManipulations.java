package day37_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IntegerListManipulations {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		System.out.println(nums);
//		nums.remove(new Integer(3));
		nums.remove(Integer.valueOf(3));
		System.out.println(nums);
		nums.remove(2);
		System.out.println(nums);
		
	}
}
