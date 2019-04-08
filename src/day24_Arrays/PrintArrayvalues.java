package day24_Arrays;

public class PrintArrayvalues {
	public static void main(String[] args) {
		String[] cars=new String[10];
		cars[0]="Acura";
		cars[1]="BMW";
		cars[2]="Mercedes";
		cars[3]="Lexus";
		cars[4]="Hyundai";
		cars[5]="Honda";
		cars[6]="Toyota";
		cars[7]="Tesla";
		cars[8]="Dodge";
		cars[9]="Kia";
//		System.out.println(cars.length);
//		int i=0;
//		System.out.println(cars[0]);
//		for(int i=0; i<cars.length;i++)
//		{
//			System.out.println(cars[i]);
//		}
		
		for(String car : cars)
		{
			System.out.println(car);
		}
		int [] nums= {1,2,35,6,7,5,56};
		for(int a : nums)
		{
			System.out.println(a);
		}
	}
}
