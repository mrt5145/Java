package day32_methodswithReturn;

public class AccumulatorMethods {
	public static void main(String[] args) {
		System.out.println(getStars(6));
		System.out.println(getStars(1));
		int[]nums= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
		for(int n:nums)
		{
			System.out.println(getStars(n));
		}
		System.out.println(sumTon(4));
		System.out.println(sumTon(6));
	}
	public static String getStars(int count)
	{
		String stars="";
		for(int i = 0 ; i<count ; i++)
		{
			stars=stars+"*";
		}
		return stars;
	}
	public static int sumTon(int num)
	{
	int sum=0;
	for(int i =1 ; i<=num;i++)
	{
		sum=sum+i;
	}
	return sum;
	}
}
