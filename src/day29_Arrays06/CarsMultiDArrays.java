package day29_Arrays06;

import java.util.Arrays;

public class CarsMultiDArrays {
	public static void main(String[] args) {
		String[]nations= {"Japanese","German","American","Italian"};
		String[][] cars= {
							{"Honda","Lexus","Toyota","Acura","Mazda","Nissan","Subaru"},
							{"Audi","BMW","Porsche","VW","MB"},
							{"Dodge","Ford","Tesla","Jeep","Chevrolet","Lincoln"},
							{"Ferrari","Fiat","Maserati","Lamborgini","Alfa Romeo","Lacia"},
						};
//		for(int i = 0; i<cars.length; i++)
//		{
//			for(int j=0; j<cars[i].length;j++)
//			{
//				System.out.println(cars[i][j]);
//			}
//		}
//		System.out.println();
		for(int i = 0; i<cars.length; i++)
		{
			System.out.println(nations[i]);
			System.out.println();
			for(int j=0; j<cars[i].length;j++)
			{
				System.out.println(cars[i][j]);
			}
			System.out.println();
		}
		
		for(String[]carGroups:cars) {
			for(String car: carGroups) {
				System.out.print(car+" ");
			}
		}
		System.out.println();
		System.out.println(Arrays.deepToString(cars));
	}
}
