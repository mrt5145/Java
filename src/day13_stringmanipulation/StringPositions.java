package day13_stringmanipulation;

public class StringPositions {
	public static void main(String[] args) {
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		System.out.println(alphabet.indexOf("p"));
		System.out.println(alphabet.indexOf("efg"));
		String sentence="Today is Sunday and tomorrow is Monday";
		System.out.println(sentence.indexOf("Sunday"));
		System.out.println(sentence.indexOf("a"));
		System.out.println(sentence.indexOf("to"));
		System.out.println(sentence.lastIndexOf("a"));
		System.out.println(sentence.indexOf("a",14));
	}
}