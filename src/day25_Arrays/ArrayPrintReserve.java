package day25_Arrays;

public class ArrayPrintReserve {
	public static void main(String[] args) {
		int[] numbers= {1,56,76,42,23,45,56,76,87,97};
		if(numbers.length==10)
		{
			System.out.println("10 numbers found");
		}
		else
		{
			System.out.println("we need 10 numbers");
		}
		int even=0;
		for(int i=numbers.length-1; i>=0;i--)
		{
			if(numbers[i]%2==0)
			{
				even++;
			}
		}
		System.out.println(even+" even numbers");
		for(int i:numbers)
		{
			System.out.println(i);
		}
		int i=0;
		do
		{
			System.out.print(numbers[i]+" ");
			i++;
		}while(i<10);
		
	}
}
