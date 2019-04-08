package day41_classes02_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class houseBuilder {
	
	public static void main(String[] args) {
		house h1 = new house();
		h1.type="Range";
		h1.bedrooms=5;
		h1.year=2012;
		h1.address="5342 S Istanbul St. Parker 80435";
		
		house h2 = new house();
		h2.type="TownHouse";
		h2.bedrooms=2;
		h2.year=2008;
		h2.address="542 S Main St. Aurora 80015";
		
		house h3 = new house();
		h3.type="Apartment";
		h3.bedrooms=1;
		h3.year=2015;
		h3.address="12 S 1st St. Cherry Creek 80045";
		
		house h4 = new house();
		h4.type="Mansion";
		h4.bedrooms=123;
		h4.year=1800;
		h4.address="5342 S virginia St. Parker 80435";
		
		
		System.out.println("House1 type : "+h1.type);
		System.out.println("House2 type : "+h2.type);
		System.out.println("House3 type : "+h3.type);
		System.out.println("House4 type : "+h4.type);
		
		house[]houses=new house[4];
		
		houses[0]=h1;
		houses[1]=h2;
		houses[2]=h3;
		houses[3]=h4;
		
		System.out.println(houses[0].address);
		
		for(int i=0;i<houses.length;i++)
		{
			System.out.println();
			System.out.println("Address of the house  : " +houses[i].address);
			System.out.println("Type of the House     : " +houses[i].type);
			System.out.println("Built year            : " +houses[i].year);
			System.out.println("Bedroom               : "+houses[i].bedrooms);
		}
		
		ArrayList<house> housesList = new ArrayList<>();
		
		housesList.add(h1);
		housesList.add(h2);
		housesList.add(h3);
		housesList.add(h4);
		
		ArrayList<house> HouseList2=new ArrayList<>(Arrays.asList(houses));
		
		
		List<house> HouseList3 =Arrays.asList(houses);
		
//		Print year of each house if the year between 2006 and 2018
		
		for(int i=0; i<HouseList3.size();i++ )
		{
			int year=HouseList3.get(i).year;
			if(year>=2006&&year<=2018)
			{
				System.out.println(HouseList3.get(i).address+" Year : " +HouseList3.get(i).year);
			}
		}
	}

	
}
