package day28_Array;

import java.util.Arrays;

public class ArraysToString {
	public static void main(String[] args) {
		int[] nums= {5,6,45,7654,2,3,67,7,898,27};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
