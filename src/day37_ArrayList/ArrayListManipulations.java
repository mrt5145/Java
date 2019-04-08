package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulations {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(123);
		nums.add(134);
		nums.add(543);
		ArrayList<Integer> numscopy = new ArrayList<>(nums);
		System.out.println(numscopy);
		
		Integer[] number = {12,3,34,54,76,87,34,653,567,786};
		List <Integer> numberList = Arrays.asList(number);
		System.out.println(numberList);
		List<String> cities = Arrays.asList(new String [] {"Gaziantep","Istanbul","Ankara"});
		System.out.println(cities);
//		numberList.add(numberList.size(), 1324);
		System.out.println(numberList);
		ArrayList<Integer> copy = new ArrayList<>();
		copy.add(1);
		copy.add(2);
		copy.addAll(numberList);
		System.out.println(copy);
		copy.removeAll(numberList);
		System.out.println(copy); 
		ArrayList<Integer> inte = new ArrayList<>();
//		inte.addAll(3,numberList);
		System.out.println(inte);
		System.out.println(numberList.indexOf(34));
		cities.set(cities.indexOf("Ankara"), "Denver");
		System.out.println(cities);
	}
}
