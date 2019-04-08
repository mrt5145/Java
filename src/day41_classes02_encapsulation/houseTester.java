package day41_classes02_encapsulation;

public class houseTester {

	public static void main(String[] args) {
	
		house h1 = new house();
		h1.type="Castle";
		h1.address="423 S Potomac Way CO 80012";
		h1.year=1998;
		h1.bedrooms=5;
		
		
		printHomeInfo(h1);
		
		
		house h2 = new house();
		h2.type="Single House";
		h2.address="915 S Helena Way CO 80013";
		h2.year=1981;
		h2.bedrooms=2;
		
		
		printHomeInfo(h2);
		
		
		house h3 = buildAHouse("3357 S Helena St","TownHouse",1985,3);
		
		printHomeInfo(h3);
		
		System.out.println(buildAHouse("3357 S Helena St","TownHouse",1985,3).address);
		
	}
	
	public static void printHomeInfo(house house)
	{
		System.out.println("=============================");
		System.out.println("Type     : " + house.type);
		System.out.println("Address  : " + house.address);
		System.out.println("Bedrooms : "+ house.bedrooms);
		System.out.println("Year     : " + house.year);
		System.out.println("=============================");
	}
	
	public static house buildAHouse(String Address,String Type,int year, int bedrooms)
	{
		house h3 = new house();
		h3.address=Address;
		h3.type=Type;
		h3.bedrooms=bedrooms;
		h3.year=year;
		return h3;
	}
}
