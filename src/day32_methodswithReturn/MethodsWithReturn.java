package day32_methodswithReturn;

public class MethodsWithReturn {
	
	public static void main(String[] args) {
		int amount= giveme5$();
		System.out.println(amount);
		String president=getPresidentName();
		System.out.println(president);
		System.out.println("US president name is " + getPresidentName());
		System.out.println("Your email address is : "+getFirstName().toLowerCase()+"_"+getLastName().toLowerCase()+"@gmail.com");
		String Email=getFirstName().toLowerCase()+"_"+getLastName().toLowerCase()+"@yahoo.com";
		System.out.println(Email);
	}

	public static int giveme5$()
	{
		int d=5;
		return d;
	}
	
	public static String getPresidentName()
	{
		return "Donald Trump";
	}
	public static String getFirstName()
	{
		String name="Murat";
		return name;
	}
	public static String getLastName()
	{
		return "Tuter";
	}
	
}
