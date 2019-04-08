package day37_ArrayList;

import java.util.ArrayList;

public class Cities {
	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Gaziantep");
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Izmir");
		cities.add("Nigde");
		cities.add("Denver");
		cities.add("Aurora");
		cities.add("Kayseri");
		cities.add("Antalya");
		cities.add("Greenwood Village");
		cities.add("Littleton");
		cities.add("Cherry Creek");
		cities.add("Irvine");
		cities.add("New York");
		cities.add("San Francisco");
		System.out.println(cities.size());
		System.out.println();
		for(String city : cities)
		{
			System.out.print(city + " ");
		}
		System.out.println();
		
		ArrayList<String> longNames=new ArrayList<>();
		for (String city : cities)
		{
			if(city.length()>6)
			{
				longNames.add(city);
			}
		}
		System.out.println(longNames);
		System.out.println(longNames.size());
		longNames.clear();
		System.out.println("Is it Empty after clear method? : " + longNames.isEmpty());
		for(int i = 0; i<cities.size();i++)
		{
			if(cities.get(i).length()>6)
			{
				longNames.add(cities.get(i));
			}
		}
		System.out.println("Long Named Cities Count : "+ longNames.size());
		System.out.println(longNames);
	}
}
