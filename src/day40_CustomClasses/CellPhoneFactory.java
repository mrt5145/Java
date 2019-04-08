package day40_CustomClasses;

public class CellPhoneFactory {
	
	public static void main(String[] args) {
		//Create an object from CellPhone class
		CellPhone cell1 = new CellPhone();
		cell1.brand="iPhone 8Plus";
		cell1.color="red";
		cell1.price=799.99;
		
		cell1.call();
		cell1.text();
		
		CellPhone cell2 = new CellPhone();
		cell2.brand="Nokia 3310";
		cell2.color="Black";
		cell2.price=12.5;
		
		cell2.text();
		cell2.call();
		
		CellPhone cell3 = new CellPhone();
		cell3.brand="HTC One";
		cell3.color="Silver";
		cell3.price=50.2;
		
		cell3.call();
		cell3.text();
		
		System.out.println();
		System.out.println(cell1.brand);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		System.out.println();
		
		System.out.println(cell2.brand);
		System.out.println(cell2.color);
		System.out.println(cell2.price);
		System.out.println();
		
		System.out.println(cell3.brand);
		System.out.println(cell3.color);
		System.out.println(cell3.price);
		
		System.out.println("Total Price for 3 phones : " +(cell1.price +cell2.price+cell3.price));
	}
}
