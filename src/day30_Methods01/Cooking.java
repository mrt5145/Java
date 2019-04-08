package day30_Methods01;

public class Cooking {
	public static void main(String[] args) {
		Menu("Kebap");
		youWillNeed("Chicken, Lamp and Marinate");
		wayOfCooking(10, "Grilling it");
		Ready();
		
	}
	public static void Menu(String foodName)
	{
		System.out.println("Today we are cooking "+foodName);
	}
	public static void youWillNeed(String items)
	{
		System.out.println("We need following items : "+items);
	}
	public static void wayOfCooking(int min,String wayOfCooking)
	{
		System.out.println("You need to cook for "+ min + " minutes by "+ wayOfCooking);
	}
	public static void Ready()
	{
		System.out.println("Enjoy with your meal!");
	}
}
