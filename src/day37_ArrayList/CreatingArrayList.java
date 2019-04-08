package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrayList{
	public static void main(String[] args) {
		
		ArrayList<String> fruits1 = new ArrayList<>();
		List<String> fruits2 = new ArrayList<>();
		ArrayList<String> fruits3 = new ArrayList<>(20);
		List<String> fruits4 = new ArrayList<>(10);
		ArrayList<String> fruits5 = new ArrayList<>(fruits1);
		List<String> fruits6= Arrays.asList(new String[] {"kiwi","Peach","Pear","Mango","Watermelon"});//that one not dynamic we cant add or remove any more item its fix sized. !!!
		List<String> fruits7=new ArrayList<>(fruits5); // That one not fix sized we can use right now .
		List<String> fruits8 = new ArrayList <>(Arrays.asList(new String []{"Plum","Cherry","Bananas","Watermelon"}));
		fruits1.add("Grapes");
		fruits1.add("Tomato");
		fruits1.add("Blueberries");
		fruits1.add(0,"Pear");
		fruits1.add(2,"Strawberries");
		System.out.println(fruits1);
		fruits2.addAll(fruits1);
		fruits2.add("Dragon Fruit");
		System.out.println(fruits2);
		
		fruits1.remove(0);
		System.out.println(fruits1);
		fruits1.remove("Strawberries");
		System.out.println(fruits1);
		
		fruits2.removeAll(fruits1);
		System.out.println(fruits2);
		fruits1.clear();
		System.out.println(fruits1);
		System.out.println(fruits1.isEmpty());
	}
}
