package day6_operators_boolean;

public class PostvsPre 
{
	public static void main(String[] args) {
		int number=1;
		int number2 = number++;
		System.out.println(number2);
		number2=++number;
		System.out.println(number2);
		int tomatoes=5;
		int bag=++tomatoes;
		System.out.println("Tomatoes= "+tomatoes);
		System.out.println("bag= "+bag);
	}

}
