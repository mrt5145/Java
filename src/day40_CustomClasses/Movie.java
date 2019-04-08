package day40_CustomClasses;

public class Movie {
	String name;
	int length;
	
	public void watch()
	{
		System.out.println("Watching " + name + ". It's Length : " + length+ " Minutes");
	}
	
	public void buy(double price)
	{
		System.out.println("Buying "+ name + " It is $"+price);
	}
	
}
