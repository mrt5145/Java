package day12_classobject_string;

public class StringClass {
	public static void main(String[] args) {
		String name="Murat";// declaring variable
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);
		name=name.toUpperCase();
		System.out.println(name);
		System.out.println(name.length());
		System.out.println("eda".length());
		int count=name.length();
		System.out.println(name.charAt(3));
	}
}
