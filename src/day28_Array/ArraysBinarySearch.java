package day28_Array;

import java.util.Arrays;

public class ArraysBinarySearch {
	public static void main(String[] args) {
		String[] words= {"pizza","cake","tomato","potato","egg"};
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		Arrays.binarySearch(words, "egg");
		System.out.println(Arrays.binarySearch(words, "potato"));
		
	}
}
