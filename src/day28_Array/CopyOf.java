package day28_Array;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		int[] nums= {5234,6,45,7654,2,3,67,7,898,27};
		
		int[] copy=Arrays.copyOf(nums, 15);
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		Arrays.sort(copy);
		System.out.println(Arrays.toString(copy));
		copy[1]=1312;
		copy[0]=12;
		copy[3]=27;
		copy[2]=90;
		copy[4]=78;
		Arrays.sort(copy);
		int[] a=Arrays.copyOf(copy, 4);
		System.out.println(Arrays.toString(a));
		a=Arrays.copyOf(a, 6);
		System.out.println(Arrays.toString(a));
	}
}
