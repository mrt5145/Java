package day29_Arrays06;

public class MultiDArrays {
	public static void main(String[] args) {
		int[][] nums=new int [2][3];
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		nums[1][2]=60;
		nums[1][1]=50;
		nums[1][0]=40;
		System.out.println("Number of Arrays: "+ nums.length);
		System.out.println("Number of values in first array: "+nums[0].length);
		System.out.println("Number of values in first array: "+nums[1].length);
		int[][]nums1= {{1,5},{12,34,7}};
		System.out.println(nums1[1][2]);
		System.out.println(nums1[1][2]);
		System.out.println("Number of Arrays: "+ nums1.length);
		System.out.println("Number of values in first array: "+nums1[0].length);
		System.out.println("Number of values in first array: "+nums1[1].length);
		
	}
}
