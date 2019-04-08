package day36_Overloading;

import java.util.ArrayList;

public class StringsOnlyArrayList {
	public static void main(String[] args) {
//		Create Restricted type. Can store only specific type
//		Also we can create it like that : 
//		ArrayList<String> names; 
//		names = new ArrayList<>();
//		ArrayList cannot accept primitives;
//		Which are : byte, short, int, long, float, double, char, boolean
//		ArrayList<int> names= new ArrayList<>(); I can't declare like that but I can : 
//		ArrayList<Integer> names= new ArrayList<>();
//		Must use like that : 
//		byte    -> Byte
//		short   -> Short
//		int     -> Integer
//		long    -> Long
//		float   -> Float
//		double  -> Double
//		char    -> Character
//		boolean -> Boolean
		
		ArrayList<String> names= new ArrayList<>();
		names.add("Murat");
		names.add("Hasan");
//		names.add(123);   -> Can't declare because it accept Strings 
		names.add("Caner");
		names.add("Irem");
		System.out.println(names);
		System.out.println(names.size());
		names.add("Murray");
		System.out.println(names);
		System.out.println("Number of names is "+names.size());
		
		String first= names.get(0);
		System.out.println("First : "+ first );
		
		String last= names.get(names.size()-1);
		System.out.println("Last : " +last);
		names.remove(4);
		System.out.println(names);
		last= names.get(names.size()-1);
		System.out.println("Last : " +last);
		names.remove("Hasan");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(2));
		System.out.println(names.isEmpty());
	}
}
