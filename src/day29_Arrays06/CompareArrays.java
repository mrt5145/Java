package day29_Arrays06;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
	int[] arr1= {312,45,65,768};
	System.out.println(Arrays.toString(arr1));
	int [] arr2=arr1;
	System.out.println(Arrays.toString(arr2));
//	arr1[1]=27;
	System.out.println(arr1==arr2);
	System.out.println(Arrays.equals(arr1, arr2));
	int arr3[]= {312,45,65,768};
	System.out.println(arr2==arr3);
	System.out.println(Arrays.equals(arr2, arr3));
	String str1=new String("Hello");
	String str2=new String("Hello");
	System.out.println(str2==str1);
	System.out.println(str2.equals(str1));
	}
}
