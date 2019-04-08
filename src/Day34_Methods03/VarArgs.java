package Day34_Methods03;

public class VarArgs {
	public static void main(String[] args) {
		sum(10,20);
		SumAll(1,342,543,65);
		SumAll(3);
		SumAll(12,34,4);
		SumAll();
		shoppingList("apples","watermelon","banana","cherry","pear");
		shoppingList("tomato","lemon","eggplant","parsley","onion");
		
	}
	public static void sum(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	public static void SumAll(int ... nums)
	{
		int sum=0;
		System.out.println("Number of inputs: "+nums.length);
		for(int i =0;i<nums.length;i++)
		{
			sum+=nums[i];
		}
		System.out.println("Sum of the inputs is : "+sum);
	}
	
	public static void shoppingList(String ...list)
	{
		System.out.print("Shopping list: ");
		for(int i =0;i<list.length;i++)
		{
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	
}
