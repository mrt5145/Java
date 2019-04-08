package day36_Overloading;

public class overLoaded {
	public static void main(String[] args) {
		System.out.println(add(100,400));
		
		System.out.println(add(100.0,400.32,234.23));
		
		System.out.println(add(100.23,132.23));
		System.out.println(playGame("Soccer",22));
		System.out.println(playGame(22,"Soccer"));
	}
	
	public static int add(int num1,int num2)
	{
		int sum=num1+num2;
		return sum;
	}
	public static double add(double num1,double num2,double num3)
	{
		double sum= (num1+num2+num3);
		return sum;
	}
	public static double add(double num1,double num2)
	{
		double sum= (num1+num2);
		return sum;
	}
	public static boolean playGame(int players,String str)
	{
		System.out.println("Playing "+ str +" with "+ players + " players.");
		return (players>=2);
	}
	public static boolean playGame(String str,int players)
	{
		System.out.println("Playing "+ str +" with "+ players + " players.");
		return (players>=2);
	}
	
	public static boolean work(String jobType)
	{
		System.out.println("Working as a "+jobType + " and it is fun." );
		if(jobType.equalsIgnoreCase("SDET") || jobType.equalsIgnoreCase("developer"))
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static double work(int hours)
	{
		System.out.println("worked "+ hours + " hours and made "+ hours*60 + " income");
		return hours*60;
	}
	
}
