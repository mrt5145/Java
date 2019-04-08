package day36_Overloading;

import java.util.ArrayList;

public class ArrayListGeneral {
	public static void main(String[] args) {
//		create a general(raw type) ArrayList
//		we can store any type of data to this list.
		ArrayList list=new ArrayList();
		list.add("Java");
		list.add(true);
		list.add("Slack");
		list.add(456);
		list.add(2343.23);
		list.add('M');
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3));
		list.add("Murat");
		System.out.println(list +"\nSize is "+list.size());
		
		
	}
}
