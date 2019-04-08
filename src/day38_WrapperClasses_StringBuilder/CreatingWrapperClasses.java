package day38_WrapperClasses_StringBuilder;

public class CreatingWrapperClasses {
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		System.out.println(n1);
		Integer n2 = Integer.valueOf(100);
		Integer n3 = Integer.parseInt("43532");
		
		Double d1 = new Double(123.45);
		Double d2 = Double.valueOf("456.43");
		Double d3 = Double.valueOf("213.432");
		
		Character ch1 = new Character('A');
		Character ch2 = Character.valueOf('Q');
		
		char ch3 = '3';
		System.out.println(Character.isDigit(ch3));
		System.out.println(Character.isAlphabetic(ch3));
		
		String str="ads342";
		System.out.println(Character.isAlphabetic(str.charAt(4)));
		System.out.println(Character.toUpperCase(str.charAt(2)));
		System.out.println(Character.isLowerCase((str.charAt(2))));
		
		System.out.println(Character.isLetterOrDigit('@'));
		System.out.println(Character.isLetterOrDigit('R'));
	}
}
