package day14_stringManipulation_cont;

public class TrimExample {
	public static void main(String[] args) {
		String str= "                    blah blah blah blah                     ";
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println(str.trim().length());
		str=str.trim();
		System.out.println(str);
	}
}
